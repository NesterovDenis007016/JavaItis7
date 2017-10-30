package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int i = 0;
        int result = 1;
        boolean isPraim = true;

        System.out.println("Введите числа");

        while (number != 0) {

            if (number == 2 || number == 3) {
                isPraim = true;
            }
            if (number > 3) {
                i = 2;
                while (i * i <= number) {

                    if (number % i == 0) {

                        isPraim = false;

                        break;
                    }

                    i++;
                }
            }
            if (isPraim == true) {
                result = result * number;
            }
            number = scanner.nextInt();

        }
        System.out.println("Результат: " + result);
    }
}


