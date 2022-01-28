package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        Scanner sc = new Scanner(System.in);

        int randomNumber[] = new int[3];
        int number[] = new int[3];
        int strike;
        int ball;
        int restart;
        boolean replay = false;

        while (!replay) {
            boolean pass = false;

            strike = 0;
            ball = 0;

            //랜덤 숫자 생성
            for (int i = 0; i < randomNumber.length; i++) {
                randomNumber[i] = ((int)(Math.random() * 9) + 1);
                for (int j = 0; j < i; j++) {
                    if (randomNumber[i] == randomNumber[j]) {
                        i--;
                    }
                }
            }
            //pass될 때 까지
            while (!pass) {
                for(int i=0;i<3;i++)
                    System.out.println(randomNumber[i]);

                for (int i = 0; i < number.length; i++) {
                    number[i] = sc.nextInt();
                    //0~10 사이 숫자 입력 받음
                    while (number[i] >= 10 || number[i] <= 0) {
                        System.out.println("1~9사이 숫자 하나만 입력");
                        number[i] = sc.nextInt();
                    }
                }
                //중복방지
                if (number[0] == number[1] || number[0] == number[2] || number[1] == number[2]) {
                    pass = false;
                    System.out.println("중복됨");
                } else {
                    pass = true;
                }

                //입력한 숫자 출력
                System.out.println("입력한 숫자: " + number[0] + ", " + number[1] + ", " + number[2]);

                //랜덤숫자와 입력숫자 비교
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (randomNumber[i] == number[j]) {
                            if (i == j) {
                                strike++;
                            } else {
                                ball++;
                            }
                        }
                    }
                }
                //다 맞췄을 때
                if (strike == 3) {
                    System.out.println("3 strike");
                    System.out.println("재 도전 1 종료 2");
                    restart = sc.nextInt();
                    if (restart == 1) {
                        pass = true;
                        replay = false;
                    } else {
                        replay = true;
                    }
                } else { //틀렸을 떄
                    System.out.println(strike + "strike, " + ball + "ball");
                    pass = false;
                }

                strike = 0;
                ball = 0;
            }
        }
        System.out.println("end");
    }
}
