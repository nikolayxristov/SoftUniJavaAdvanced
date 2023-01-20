package StacksAndQueues.lab;

import java.util.*;
import java.util.stream.Collectors;

public class simpleCalculator {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Collections.reverse(inputList);

        for (String element : inputList) {
            stack.push(element);
        }



        while (stack.size() > 1) {
            String result = "";
            int firstNum = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            switch (operator){
                case "+": result = firstNum + secondNum + ""; break;

                case "-": result = firstNum - secondNum + ""; break;

                default: break;
            }

            stack.push(result);

        }

        System.out.println(stack.peek());

    }

}
