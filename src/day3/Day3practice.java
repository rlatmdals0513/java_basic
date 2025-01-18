package day3;

import java.util.Scanner;

public class Day3practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 숫자를 입력하시오");
        double num1 = sc.nextDouble ();
        System.out.print("2번째 수도 입력해라");
        double num2 = sc.nextDouble();
        System.out.print("3번째도");
        double num3 = sc.nextDouble();

        double average3 = (num1 +num2 + num3) / 3.0;
        System.out.println("평균="+average3);
        double average4 = Math.round(average3);
        System.out.println("average4 = " + average4);

    }
}
