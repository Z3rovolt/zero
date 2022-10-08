package lesson2;

import java.util.Scanner;


public class Calc {
    static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        double number1, number2;
        String operation;
        System.out.println("enter number1");
        number1 = SCANNER.nextDouble();
        System.out.println("enter operation");
        operation = SCANNER.next();


        switch (operation) {
            case "+":
                System.out.println("enter number2");
                number2 = SCANNER.nextDouble();
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println("enter number2");
                number2 = SCANNER.nextDouble();
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println("enter number2");
                number2 = SCANNER.nextDouble();
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println("enter number2");
                number2 = SCANNER.nextDouble();
                System.out.println(number1 / number2);
                break;

        }


    }
}
