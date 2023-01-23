package StacksAndQueues.exe;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class maximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> numStack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            if (inputArr[0].equals("1")) {
                numStack.push(inputArr[1]);
            } else if (inputArr[0].equals("2")) {
                numStack.pop();
            } else {
                String maxElement = Collections.max(numStack);
                System.out.println(maxElement);
            }
        }
    }
}
