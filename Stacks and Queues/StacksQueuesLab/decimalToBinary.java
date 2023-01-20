package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> binaryDigits = new ArrayDeque<>();

        int inputNum = Integer.parseInt(scanner.nextLine());

        if (inputNum < 0) {
            return;
        } else if (inputNum == 0) {
            System.out.println(0);
        } else {

            while (inputNum > 0) {

                if (inputNum % 2 == 0) {
                    binaryDigits.push("0");
                } else {
                    binaryDigits.push("1");
                }

                inputNum = inputNum / 2;

            }
        }

        StringBuilder output = new StringBuilder();

        for (String element : binaryDigits) {
            output.append(element);
        }

        System.out.println(output);

    }
}
