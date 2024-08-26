package Doit.Ch01;

import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {;

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int result;

        do {
            System.out.println("a의 값 : ");
            a = scanner.nextInt();
            System.out.println("b의 값 : ");
            b = scanner.nextInt();
        } while (a>b);

        result = b-a;

        System.out.println(result);

    }

}
