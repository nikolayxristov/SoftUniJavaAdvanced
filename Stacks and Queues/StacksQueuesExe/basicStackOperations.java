package StacksAndQueues.exe;

import java.util.*;

public class basicStackOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] parameterArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int popCount = parameterArr[1];
        int toCheck = parameterArr[2];

        int[] elementArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> numStack = new ArrayDeque<>();

        fillStack(numStack, elementArr);

        popStack(numStack, popCount);

        if (numStack.contains(toCheck)) {
            System.out.println("true");
        } else {
            System.out.println(getLowestNum(numStack));
        }

    }

    public static void fillStack(Deque<Integer> numStack, int[] elementArr) {

        for (int element : elementArr) {
            numStack.push(element);
        }

    }

    public static void popStack(Deque<Integer> numStack, int popCount) {

        for (int i = 1; i <= popCount; i++) {

            numStack.pop();

        }

    }

    public static int getLowestNum(Deque<Integer> numStack) {

        if (numStack.size() == 0) {
            return 0;
        } else {
            PriorityQueue<Integer> orderedNums = new PriorityQueue<>(numStack);
            return orderedNums.peek();
        }

    }
}
