package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// 1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5

public class matchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> openIdx = new ArrayDeque<>();


        String input = scanner.nextLine();
        char[] symbolArr = input.toCharArray();

        for (int i = 0; i < symbolArr.length; i++) {
            char symbol = symbolArr[i];

            if(symbol == '('){
                openIdx.push(i);
            } else if (symbol == ')') {
                System.out.println(input.substring(openIdx.pop(), i + 1));
            }
        }
    }
}
