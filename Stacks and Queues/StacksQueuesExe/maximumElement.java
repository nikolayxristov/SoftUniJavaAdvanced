package StacksAndQueues.exe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class maximumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> numStack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = 0;

        for (int i = 0; i < n; i++) {

            String[] inputArr = scanner.nextLine().split("//s");

            switch (inputArr[0]) {
                case "1":
                    numStack.push(Integer.parseInt(inputArr[1]));
                    break;
                case "2":
                    if (numStack.size() > 0) {
                        numStack.pop();
                    }
                    break;
                case "3":

                    for (int j = 0; j < numStack.size(); j++) {
                        int currentNum = numStack.pop();

                        if (currentNum > maxNum) {
                            maxNum = currentNum;
                        }
                        numStack.add(currentNum);
                    }

                    System.out.println(maxNum);
                    maxNum = 0;
                    break;
                default:
                    break;
            }

        }

    }

}
