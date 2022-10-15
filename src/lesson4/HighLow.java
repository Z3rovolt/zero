package lesson4;

import java.util.Scanner;

public class HighLow {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        start();
        int b = random();
        guess(b);
        end();

    }


    public static void start() {
        System.out.println("Lets start a game. Try to guess the number. You have 7 tries)");

    }


    public static int number() {
        int n;
        System.out.println("Enter the number");
        n = SCANNER.nextInt();


        return n;
    }

    public static int random() {
        int r = (int) (Math.random() * 100);


        return r;
    }

    public static void guess( int r) {

        for (int i = 7; i >= 0; i--) {
            int n;
            n = number();
            if (n == r) {
                System.out.println("You are lucky son of a bitch!!!");
                break;

            } else if((n!=r) && (i == 0)) {
                System.out.println("You lose. The number was " + r);
                break;
            } else if (n > r) {
                System.out.println("Too High");

            } else if (n < r) {
                System.out.println("Too Low");

            }
        }

    }

    public static void end(){

int z =random();
        System.out.println("You want to play again? y/n ");
        String more = SCANNER.next();
        if (more.equals("y")){
            guess(z);
            end();

        }
        else if(more.equals("n")){
            System.out.println("Thanks for playing");

        }
        else {
            System.out.println("Wrong button");
            end();
        }




    }
}