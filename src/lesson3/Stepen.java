package lesson3;

import java.util.Scanner;

public class Stepen {

    static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {

        int n;
        int x;
        int result = 1;
        System.out.println("введите число");
        n = SCANNER.nextInt();
        System.out.println("введите степень");
        x = SCANNER.nextInt();

        for (int i = 1; i <= x; i++) {

            result *= n;

        }
        System.out.println(result);


    }
}
