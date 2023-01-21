package StacksAndQueues.exe;

import java.util.*;

public class basicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] parameterArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int pollCount = parameterArr[1];
        int toCheck = parameterArr[2];

        int[] elementArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> numQueue = new ArrayDeque<>();

        fillQueue(numQueue, elementArr);

        pollQueue(numQueue, pollCount);

        if (numQueue.contains(toCheck)) {
            System.out.println("true");
        } else {
            System.out.println(getLowestNum(numQueue));
        }

    }

    public static void fillQueue(Deque<Integer> numQueue, int[] elementArr) {

        for (int element : elementArr) {
            numQueue.offer(element);
        }

    }

    public static void pollQueue(Deque<Integer> numQueue, int pollCount) {

        for (int i = 1; i <= pollCount; i++) {

            numQueue.poll();

        }

    }

    public static int getLowestNum(Deque<Integer> numQueue) {

        if (numQueue.size() == 0) {
            return 0;
        } else {
            PriorityQueue<Integer> orderedNums = new PriorityQueue<>(numQueue);
            return orderedNums.peek();
        }

    }
}
