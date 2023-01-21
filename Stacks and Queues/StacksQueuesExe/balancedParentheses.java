package StacksAndQueues.exe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class balancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        char[] parenthesesArr = expression.toCharArray();

        if (parenthesesArr.length % 2 != 0) {
            System.out.println("NO");
            return;
        }

        Deque<Character> openingParentheses = new ArrayDeque<>();
        Deque<Character> closingParentheses = new ArrayDeque<>();

        for (int i = 1; i <= parenthesesArr.length / 2 ; i++) {
            openingParentheses.push(parenthesesArr[i - 1]);
        }

        for (int i = parenthesesArr.length; i > parenthesesArr.length / 2 ; i--) {
            closingParentheses.push(parenthesesArr[i - 1]);
        }

        boolean flag = true;

        while (openingParentheses.size() > 0) {

            if (openingParentheses.peek() == '(' && closingParentheses.peek() == ')') {
                openingParentheses.pop();
                closingParentheses.pop();
            } else if (openingParentheses.peek() == '[' && closingParentheses.peek() == ']') {
                openingParentheses.pop();
                closingParentheses.pop();
            } else if (openingParentheses.peek() == '{' && closingParentheses.peek() == '}') {
                openingParentheses.pop();
                closingParentheses.pop();
            } else {
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
