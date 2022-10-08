import java.sql.SQLOutput;
import java.util.Scanner;


public class Sale {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double n , a , b, x , y;
        System.out.println("Введите исходную стоимость товара");
        n = SCANNER.nextDouble();
        System.out.println("введите альтернативную стоимость товара");
        a = SCANNER.nextDouble();
        System.out.println("выберите скидку в процентах");
        y = SCANNER.nextDouble();
        System.out.println();
        System.out.println("введите альтернативну стоимость2 товара");
        b = SCANNER.nextDouble();
        System.out.println("введите скидку2 в процентах");
        x = SCANNER.nextDouble();
        if (n<a && n<b){
            System.out.println(n);
        }
        else if(n>a && a>b){
            System.out.println(n-(n*y)/100);
        }
        else if(n>b && b>a){
            System.out.println(n-(n*x)/100);
        }
        else if(n>a && a==b);{
            System.out.println(n-(n*y)/100);
            System.out.println(n-(n*x)/100);
        }
    }

}
