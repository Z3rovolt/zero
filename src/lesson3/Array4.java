package lesson3;

import java.util.Arrays;

public class Array4 {

    public static void main(String[] args) {
        int[] array = {4, -5, 0, 6, 8};
        int max = array[0];
        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                minIndex = i;
                min = array[i];
            }

            if (max < array[i]) {
                maxIndex = i;
                max = array[i];
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;


        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");


        }


    }
}

