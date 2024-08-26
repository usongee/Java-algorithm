package Doit.Ch02.practice;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxOfArrayRand {

    static int maxOf(int[] a) {
        int max = a[0];
        for ( int i=0;i<a.length;i++) {
            if(a[i] > max) {
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 길이 : ");
        int num = scanner.nextInt();


        int[] height = new int[num];
//
//        for(int i=0; i<num; i++) {
//            System.out.println("height[i] : ");
//            height[i] = scanner.nextInt();
//        }



        for(int i=0;i<num;i++) {
            height[i] = random.nextInt(100) + 1;
            System.out.println(height[i]);
        }

        System.out.println("height의 최댓값 : "  + maxOf(height));


    }

}