package StacksAndQueues.exe;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class maximumElement2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());
        int maxElement = 0;

        for (int i = 1; i <= commandsCount; i++) {

            List<Integer> commandList = Arrays.stream(scanner.nextLine().split(" ")).
                    map(e -> Integer.parseInt(e)).collect(Collectors.toList());

            if (commandList.get(0) == 1) {
                stack.push(commandList.get(1));
            } else if (commandList.get(0) == 2) {
                if (stack.size() >= 1) {
                    stack.pop();
                }
            } else {
                for (int element : stack) {
                    if (element > maxElement) {
                        maxElement = element;
                    }
                }

                if (maxElement != 0) {
                    System.out.println(maxElement);
                }

            }

        }


    }

}
