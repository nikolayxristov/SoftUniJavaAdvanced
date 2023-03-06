package definingClasses.carInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carArr = scanner.nextLine().split(" ");
            Car car = new Car();

            car.setBrand(carArr[0]);
            car.setModel(carArr[1]);
            car.setHorsepower(Integer.parseInt(carArr[2]));

            System.out.println(car.carInfo());

        }
    }
}
