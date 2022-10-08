package lesson2;


import java.util.Scanner;
import java.math.BigDecimal;

public class mathGrade8 {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, x1, x2, d;
        // Ax2 + Bx + C =0
        System.out.println("Введите а");
        a = SCANNER.nextDouble();
        System.out.println("Введите b");
        b = SCANNER.nextDouble();
        System.out.println("Введите c");
        c = SCANNER.nextDouble();
        d = b * b - 4 * a * c;
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Уравнения не существует");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Уравнения не существует");
        } else if (a == 0 && b != 0 && c != 0) {
            x1 = (-1 * c) / b;
            System.out.println(x1);

        }
        else if (d>0){
            x1=((-b) + Math.sqrt(d))/(2*a);
            x2=((-b) - Math.sqrt(d))/(2*a);
            System.out.println(x1+" e"+x2);
        }
        else if(d==0){
            x1=((-b) + Math.sqrt(d))/(2*a);
            System.out.println(x1);


        }
        else
        {
            System.out.println("корней нет");
        }


    }
}
