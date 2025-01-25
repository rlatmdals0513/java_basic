package day4;

import java.util.Scanner;

public class Day4condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 내놔");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1+"가 큰놈이야");
        }
        else if(num1<num2){
            System.out.println(num2+"가 큰놈이야");
        }
        else{
            System.out.println("똑같아");
        }

//        int maxNum = (num1 > num2) ? num1 : num2;
//        System.out.println("큰 놈은"+maxNum+"이야");
//        int day = sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("짜증나는 월요일");
//                break;
//            case 2:
//                System.out.println("월유일 친구 화요일");
//                break;
//            case 3:
//                System.out.println("2일 남았다 수요일");
//                break;
//            default:
//                System.out.println("몰라 ");
//        }
//        int number = sc.nextInt();
//        if (number > 0) {
//            System.out.println("양수입니다.");
//        } else if (number < 0) {
//            System.out.println("음수입니다.");
//        }else{
//            System.out.println("0이야 바보야");
//        }

    }
}