package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class printerQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<String> printQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {

                if (printQueue.size() == 0) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printQueue.remove());
                }

            } else {

                printQueue.add(input);

            }

            input = scanner.nextLine();
        }

        for (String element : printQueue) {
            System.out.println(element);
        }
    }
}
