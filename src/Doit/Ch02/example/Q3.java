package Doit.Ch02.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

    static int sumOf(int[] a) {
        int sum=0;
        for(int i=0; i<a.length; i++ ) {
            sum += a[i];
        }
        return sum;
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

        System.out.println("총 합:" + sumOf(score));
    }
}
