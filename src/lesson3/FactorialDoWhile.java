package lesson3;

import java.util.Scanner;

public class FactorialDoWhile {


    static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        int n;
        int i = 1;
        int result = 1;
        System.out.println("введите число");
        n = SCANNER.nextInt();

        do {

            i++;
            result *= i;

        } while (i < n);
        System.out.println(result);

    }


}
