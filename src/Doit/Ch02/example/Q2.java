package Doit.Ch02.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

    static void swap(int a[], int i1, int i2) {
        int t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
    }

    static void reverse (int[] a) {
        for(int i=0; i<a.length/2; i++) {
            swap(a, i, a.length-i-1);
            System.out.println("a[" + i + "]과 a[" + (a.length-i-1) + "을 교환합니다." );
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("수 입력 : ");
        int num = scanner.nextInt();

        int score[] = new int[num];

        for(int i=0; i<num; i++) {
            score[i] = random.nextInt(100) + 1;
            System.out.println(i + "의 점수" + score[i]);
        }
        System.out.println(Arrays.toString(score));
        System.out.println("===========================");

        reverse(score);
    }
}
