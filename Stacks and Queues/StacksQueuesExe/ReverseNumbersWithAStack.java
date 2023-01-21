package StacksAndQueues.exe;

import java.util.*;

public class ReverseNumbersWithAStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();

        for (String element : inputArr) {
            stack.push(element);
        }

        StringBuilder output = new StringBuilder();

        while (stack.size() > 0) {
            if (stack.size() == 1) {
                output.append(stack.pop());
            } else {
                output.append(stack.pop());
                output.append(" ");
            }
        }

        System.out.println(output);

    }

}
