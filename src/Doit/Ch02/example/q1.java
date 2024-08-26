package Doit.Ch02.example;

import java.util.Random;
import java.util.Scanner;

public class q1 {

    static int maxOf(int a[]) {
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(10) + 1;

        System.out.println("사람 수  : " + num);

        int height[] = new int[num];

        for(int i=0; i<num; i++ ) {
            height[i] = random.nextInt(90) + 100;
            System.out.println("height[i]의 값  : " + height[i]);
        }

        System.out.println("최대값: " + maxOf(height));
    }
}
