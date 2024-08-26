package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoMachine {


    //로또 번호 입력
    public static int num() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("로또 번호를 6개 입력하세요. ");
        int num[] = new int[6];
        for(int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println("입력한 로또 번호는 : " + Arrays.toString(num));

        return num;
    }
    
    //로또 생성
    public static int[] randomNum() {
        Random random = new Random();
        int autoNum[] = new int[6];
        for(int i=0; i<autoNum.length; i++) {
            autoNum[i] = random.nextInt(45) + 1;
        }
        System.out.println("로또 번호 : " + Arrays.toString(autoNum));

        return autoNum;
    }

    //당첨 번호 확인
    public static void result(int[] num, int[] autoNum) {
        int result[] = new int[6];
        int a = 0;
        for(int i=0; i< num.length; i++) {
            for(int j=0; j<autoNum.length; j++) {
                if(num[i]==autoNum[j])
                    result[a++] = num[i];
            }
        }
        System.out.println("일치하는 번호 : " + Arrays.toString(result));
        System.out.println("일치하는 개수 : " + a);
    }

    public static int money() {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt(); //금액 입력 (천원 이상, *000 단위)

        return money;
    }

    public static int playTime() {
        Scanner scanner = new Scanner(System.in);
        int playTime = scanner.nextInt();
        return playTime;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("금액 입력(0은 빼고 입력) : " + money());
        System.out.println("수동 횟수 입력(남은 횟수는 자동) : " + playTime());

        int[][] num = new int[money()][6];

        //수동
        for(int i=0; i<playTime(); i++) {
            for(int j=0; j<6; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        //자동
        Random random = new Random();

        for(int i=playTime(); i<money()-playTime(); i++) {
            for(int j=0; j<6; j++) {
                num[i][j] = random.nextInt(45)+1;
            }
        }

        System.out.println("게임을 시작하려면 [게임시작]을 입력해주세요 ");

        String play = scanner.next();
//        if(play.equals("게임시작")) {
//            int autoNum[] = randomNum(); //랜덤 번호
//            result(num, autoNum); //당첨 결과 확인
//        }
    }
}
