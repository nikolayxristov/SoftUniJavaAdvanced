package definingClasses.carConstructors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carArr = scanner.nextLine().split(" ");
            Car car;
            if (carArr.length == 1) {
                car = new Car(carArr[0]);
            } else {
                car = new Car(carArr[0], carArr[1], Integer.parseInt(carArr[2]));
            }
            System.out.println(car.toString());
        }
    }
}
