package lesson2;

import java.util.Scanner;

public class MathOperation {

    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter your first number");
        int number1;
        number1 = SCANNER.nextInt();
        System.out.println("enter your second number");
        int number2;
        number2 = SCANNER.nextInt();
        System.out.println("your number is " + ((number1 + number2) / 2));
    }

    static {
        int number1, number2, number3, number4, number5, count, result;
        System.out.println("enter how many numbers");
        count = SCANNER.nextInt();

        switch (count) {
            case 2:
                System.out.println("enter number1");
                number1 = SCANNER.nextInt();
                System.out.println("enter number2");
                number2 = SCANNER.nextInt();
                result = (number1 + number2) / 2;
                System.out.println(result);
                break;
            case 3:
                System.out.println("enter number1");
                number1 = SCANNER.nextInt();
                System.out.println("enter number2");
                number2 = SCANNER.nextInt();
                System.out.println("enter number3");
                number3 = SCANNER.nextInt();
                result = (number1 + number2 + number3) / 3;
                System.out.println(result);
                break;
            case 4:
                System.out.println("enter number1");
                number1 = SCANNER.nextInt();
                System.out.println("enter number2");
                number2 = SCANNER.nextInt();
                System.out.println("enter number3");
                number3 = SCANNER.nextInt();
                System.out.println("enter number4");
                number4 = SCANNER.nextInt();
                result = (number1 + number2 + number3 + number4) / 4;
                System.out.println(result);
                break;
            case 5:
                System.out.println("enter number1");
                number1 = SCANNER.nextInt();
                System.out.println("enter number2");
                number2 = SCANNER.nextInt();
                System.out.println("enter number3");
                number3 = SCANNER.nextInt();
                System.out.println("enter number4");
                number4 = SCANNER.nextInt();
                System.out.println("enter number5");
                number5 = SCANNER.nextInt();
                result = (number1 + number2 + number3 + number4 + number5) / 5;
                System.out.println(result);
                break;


        }


    }


}
