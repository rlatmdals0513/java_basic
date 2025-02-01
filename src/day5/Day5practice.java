package day5;

import java.util.Scanner;

public class Day5practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1번문제
//        for(int i=1;i<11;i++){
//            System.out.println("i = " + i);
//        }
        //2번 문제
//        for(int i =1;i<11;i+=2){
//            System.out.println("i = " + i);
//        }

//         //3번문제
//        for(int i=1;i<11;i++){
//            if(i%2 == 0){
//                System.out.println("i = " + i);
//            }
//
//        }

        //4번 문제
//        System.out.print("곱해야 할 수를 입력하시오(2~9)");
//        int t = sc.nextInt();
//        if(1<t&&t<10){
//            for(int i = 1;i<10;i++){
//                System.out.println(t +"*"+ i +"="+(i*t));
//
//            }
//
//        }
        System.out.print("숫자 내놔");
        int t = sc.nextInt();
        for(int i=3;i<55;i++){
            if(i==3 || i==6 || i==7 || i==9 || i==18){
                System.out.println(t+"*"+i+"="+(t*i));
            }
        }

    }
}
