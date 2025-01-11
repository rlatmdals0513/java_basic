package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하시오");
        int i = sc.nextInt();
        System.out.print("두번째 수를 입력하시오");
        int l = sc.nextInt();
        System.out.println(i + " + " + l + " = " +(i+l));
        System.out.println(i + " - " + l + " = "+(i-l));
        System.out.println(i + " * " + l + " = "+(i*l));
        System.out.println(i + " / " + l + " = "+(i/l));
        System.out.println(i + " % " + l + " = "+(i%l));




//        System.out.print("출생 년도를 입력하시오: ");
//        int i = sc.nextInt();
//        System.out.println("나이="+(2025-i));



    }
}
