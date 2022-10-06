package lesson2;

import java.util.Scanner;

public class LogicOperation {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("enter number");
        count = SCANNER.nextInt();

        if (count == 1) {
            System.out.println("today is monday");
        } else if (count == 2) {
            System.out.println("today is tuesday");
        } else if (count == 3) {
            System.out.println("today is wednesday");
        } else if (count == 4) {
            System.out.println("today is thursday");
        } else if (count == 5) {
            System.out.println("today is friday");
        } else if (count == 6) {
            System.out.println("today is saturday");
        } else if (count == 7) {
            System.out.println("today is sunday");
        } else System.out.println("NEMA");
    }
}
