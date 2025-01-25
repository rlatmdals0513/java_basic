package day4;

import java.util.Scanner;

public class Day4practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번 문제
//        System.out.print("1번째 수 내놔");
//        int num1 = sc.nextInt();
//        System.out.print("2번째 수 내놔");
//        int num2 = sc.nextInt();
//        System.out.print("3번째 수 내놔");
//        int num3 = sc.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            System.out.print(num1 + "가 가장 큰놈이여");
//        }
//        else if(num2 > num1 && num2 > num3){
//            System.out.print(num2 +"가 가장 큰 놈이야");
//        }
//        else if(num3>num1 && num3>num2){
//            System.out.print(num3+"가 가장 큰 놈이여");
//        }
//        else{
//            System.out.print("같은 놈이여 3개 다");
//        }

        // 2번 문제
//        System.out.print("월을 입력해라:");
//        int num = sc.nextInt();
//        int weather = (num % 12) / 3;
//        switch (weather){
//          case 1:
//              System.out.println("봄");
//              break;
//          case 2:
//              System.out.println("여름");
//              break;
//          case 3:
//              System.out.println("가을");
//              break;
//          case 0 :
//              System.out.println("겨울");
    //}
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = sc.nextInt();

        System.out.print("연산자를 입력하시오: ");
        char num2 = sc.next().charAt(0);
        System.out.print("2번째 수를 입력하시오");
        double num3 = sc.nextInt();
        switch (num2){
            case '+':
                System.out.println(num1 + num3);
                break;
            case '-':
                System.out.println(num1 - num3);
                break;
            case '/':
                System.out.println(num1 / num3);
                break;
            case '*':
                System.out.println(num1 * num3);
        }








    }
}
