package lesson3;

import java.math.BigInteger;
import java.util.Scanner;

public class Array2 {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("введите количество чисел");
        n = SCANNER.nextInt();


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);


    }
}
