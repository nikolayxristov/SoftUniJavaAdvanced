package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    String output = stack.peek();
                    System.out.println(output);
                }
            } else {
                stack.push(input);
                String output = stack.peek();
                System.out.println(output);
            }

            input = scanner.nextLine();
        }
    }

}
