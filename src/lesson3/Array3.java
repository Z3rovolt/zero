package lesson3;

import java.util.Scanner;
import java.util.Random;
public class Array3 {

    static Scanner SCANNER = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int n;
        System.out.println("введите количество чисел");
        n = SCANNER.nextInt();


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 - 1) + 1;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

    }

}
