package Ch02.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void reverse(int[] a) {
        for(int i=0; i<a.length / 2;i++) {
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("사람 수  : " );
        int num = scanner.nextInt();


        int height[] = new int[num];

        for(int i=0; i<num; i++ ) {
//            System.out.println("height[i] 입력 " );
//            height[i] = scanner.nextInt();
            height[i] = random.nextInt(100) + 1;
            System.out.println(i + "의 값 : " + height[i]);
        }

        System.out.println(Arrays.toString(height));
        reverse(height);
        System.out.println(Arrays.toString(height));
    }
}
