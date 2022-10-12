package lesson3;

public class Array1 {

    public static void main(String[] args) {

        int[] mas = new int[10];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
            System.out.print(mas[i] + " , ");
        }


    }

}

