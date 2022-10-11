package lesson3;

import java.util.Scanner;

public class Factorial {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int result = 1;
        System.out.println("введите число");
        n = SCANNER.nextInt();


        for (int i = 2; i <= n; i++) {
           result *= i;
        }
        System.out.println(result);


    }
}
