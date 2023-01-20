package StacksAndQueues.lab;

import java.util.*;
import java.util.stream.Collectors;

public class mathPotato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] kidsArray = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

       PriorityQueue<String> kidsQueue = new PriorityQueue<>();

        Collections.addAll(kidsQueue, kidsArray);

        int counter = 0;

        while(kidsQueue.size() > 1) {

            for (int i = 1; i < rotations; i++) {
                String kid = kidsQueue.poll();
                kidsQueue.offer(kid);
            }

            counter++;

            if (isPrime(counter)) {
                System.out.println("Prime " + kidsQueue.peek());
            } else {
                System.out.println("Removed " + kidsQueue.poll());
            }

        }

        System.out.println("Last is " + kidsQueue.poll());

    }

    public static boolean isPrime(int num) {

        boolean flag = true;
        if (num == 1) {
            flag =  false;
        } else {
            for (int i = 2; i < num ; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }

}
