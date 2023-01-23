package StacksAndQueues.exe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class infixToPostfix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        Deque<String> digitsQueue = new ArrayDeque<>();
        Deque<String> operatorsStack = new ArrayDeque<>();

        for (String symbol : inputArr) {
            if (symbol.equals("(")) {
                operatorsStack.push(symbol);
            } else if (symbol.equals("+") || symbol.equals("-")) {
                if (operatorsStack.size() > 0) {
                    if (operatorsStack.peek().equals("+") || operatorsStack.peek().equals("-")) {
                        while (operatorsStack.peek().equals("+") || operatorsStack.peek().equals("-")) {
                            digitsQueue.offer(operatorsStack.pop());
                            if (operatorsStack.size() == 0) {
                                break;
                            }
                        }
                    }
                }
                operatorsStack.push(symbol);
            } else if (symbol.equals("*") || symbol.equals("/")) {
                if (operatorsStack.size() > 0) {
                    if (operatorsStack.peek().equals("*") || operatorsStack.peek().equals("/")) {
                        while (operatorsStack.peek().equals("*") || operatorsStack.peek().equals("/")) {
                            digitsQueue.offer(operatorsStack.pop());
                            if (operatorsStack.size() == 0) {
                                break;
                            }
                        }
                    }
                }
                operatorsStack.push(symbol);
            } else if (symbol.equals(")")) {
                while (!operatorsStack.peek().equals("(")) {
                    digitsQueue.offer(operatorsStack.pop());
                }
                operatorsStack.poll();
            } else {
                digitsQueue.offer(symbol);
            }
        }

        getOperators(digitsQueue, operatorsStack);

        printExpression(digitsQueue);

    }

    public static void getOperators(Deque<String> digitsQueue, Deque<String> operatorsStack) {

        while (operatorsStack.size() > 0) {
            String operator = operatorsStack.pop();
            digitsQueue.offer(operator);
        }

    }

    public static void printExpression(Deque<String> digitsQueue) {

        StringBuilder output = new StringBuilder();

        while (digitsQueue.size() > 1) {
            output.append(digitsQueue.poll());
            output.append(" ");
        }

        output.append(digitsQueue.poll());

        System.out.println(output);

    }
}