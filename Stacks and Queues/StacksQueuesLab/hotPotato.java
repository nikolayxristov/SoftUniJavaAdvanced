package StacksAndQueues.lab;

import java.util.*;
import java.util.stream.Collectors;

public class hotPotato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int bomb = Integer.parseInt(scanner.nextLine());

        Deque<String> kids = new ArrayDeque<>(inputList);



        int counter = 0;
        int idx = 0;

        while (kids.size() > 1) {

            counter++;
            idx++;

            if (idx > kids.size()) {
                idx = 1;
            }

            if (counter == bomb) {
                String kidToRemove = inputList.get(idx - 1);
                inputList.remove(idx - 1);
                kids.remove(kidToRemove);
                System.out.println("Removed " + kidToRemove);
                counter = 0;
                idx--;
            }

        }

        System.out.println("Last is " + kids.poll());

    }
}
