package lesson3;

import java.util.Scanner;

public class MultiplicationTable {

    static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {

        int x;
        System.out.println("введите число для умножения");
        x = SCANNER.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = 0;

            result = x * i;

            System.out.println(i + " * " + x + " = " + result);

        }


    }
}
