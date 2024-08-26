package Ch02.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q5 {



    static void rcopy(int[] a, int[] b) {

        for(int i=0; i<a.length; i++) {
            a[i] = b[a.length-i-1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("수 입력 : ");
        int num = scanner.nextInt();

        int a[] = new int[num];

        for(int i=0; i<num; i++) {
            a[i] = random.nextInt(100) + 1;
            System.out.println(i + "의 값" + a[i]);
        }

        int b[] = new int[num];

        for(int i=0; i<num; i++) {
            b[i] = random.nextInt(100) + 1;
            System.out.println(i + "의 값" + b[i]);
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        rcopy(a, b);
        System.out.println(Arrays.toString(a));
    }
}
