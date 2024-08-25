import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("n의값:");
       int n = scanner.nextInt();
       int sum=0;
       if(n==7) {
           for(n=1; n<8; n++) {
               sum =+ n;
           }
       } else {
           System.out.println("n이 7이 아님");

       }
       System.out.println("총 합 : " + sum);
    }
}