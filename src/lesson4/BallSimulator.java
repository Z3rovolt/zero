package lesson4;

import java.util.Scanner;

public class BallSimulator {
    static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        final double gravity = 9.8;
        double height = tower();
        calculations(gravity, height);


    }

    public static double tower() {
        double t;
        System.out.println("введите высоту башни");
        t = SCANNER.nextInt();


        return t;
    }

    public static void calculations(double g, double t) {
        double c;
        for (double i = 0 ; i <= 5; i++) {
            c = t - (g * ((i * i) / 2));
            if (c > 0) {
                System.out.println("ball will be at " + c + " meters " + " after " + i + " seconds ");
            }
            if (c < 0) {
                System.out.println("ball is on the ground after " + i + " seconds ");


            }


        }


    }


}



