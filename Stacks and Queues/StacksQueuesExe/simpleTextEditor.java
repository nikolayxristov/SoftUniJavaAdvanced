package StacksAndQueues.exe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class simpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalCommands = Integer.parseInt(scanner.nextLine());
        Deque<String> commandStack = new ArrayDeque<>();
        Deque<String> stackFor1 = new ArrayDeque<>();
        Deque<String> stackFor2 = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= totalCommands; i++) {
            String[] commandArr = scanner.nextLine().split(" ");
            String command = commandArr[0];

            if (command.equals("1") || command.equals("2")) {
                commandStack.push(command);
            }

            switch (command) {
                case "1":
                    text.append(commandArr[1]);
                    stackFor1.push(commandArr[1]);
                    break;

                case "2":
                    int elementToErase = Integer.parseInt(commandArr[1]);
                    String deleted = text.substring(text.length() - elementToErase, text.length());
                    text.delete(text.length() - elementToErase, text.length());
                    stackFor2.push(deleted);
                    break;

                case "3":
                    int idx = Integer.parseInt(commandArr[1]) - 1;
                    System.out.println(text.charAt(idx));
                    break;

                case "4":
                    String lastCommand = commandStack.pop();

                    if (lastCommand.equals("2")) {
                        text.append(stackFor2.pop());
                    } else {
                        String checkIdx = stackFor1.pop();
                        int removeIdx = text.lastIndexOf(checkIdx);
                        text.delete(removeIdx, text.length());
                    }
                    break;

                default:
                    break;

            }

        }

    }
}
