package Doit.Ch03.practice;

import java.util.Scanner;

public class SeqSearch {


    public static int search(int array[], int n, int val) {
        int i=0;

        while(true) {
            if(i==n) {
                return -1;
            }
            if(array[i] == val) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int array[] = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("요솟수["+ i+"] 입력 : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("검색할 수를 입력하세요. ");
        int val = scanner.nextInt();

        int res = search(array, num, val);
        if(res==-1) {
            System.out.println("검색 결과 없음");
        } else {
            System.out.println("검색 결과 : [" + res + "]에 있음");
        }
        
    }
}
