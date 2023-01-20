package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryUpdate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> backwardsStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (backwardsStack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.push(backwardsStack.pop());
                    String output = backwardsStack.peek();
                    System.out.println(output);
                }
            } else if (input.equals("forward")) {
                if (forwardStack.size() == 0) {
                    System.out.println("no next URLs");
                } else {
                    backwardsStack.push(forwardStack.pop());
                    System.out.println(backwardsStack.peek());
                }
            } else {
                forwardStack.clear();
                backwardsStack.push(input);
                String output = backwardsStack.peek();
                System.out.println(output);
                }

            input = scanner.nextLine();
        }
    }
}
