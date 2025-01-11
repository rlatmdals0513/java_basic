package day2;

import java.util.Scanner;

public class Day2scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("int를 입력하시오:");
        int i = sc.nextInt();
        System.out.println("i = " + i);

        System.out.print("long을 입력하세여: ");
        long l = sc.nextLong();
        System.out.println("l =" + l);

        System.out.print("double을 입력하시오:");
        double d = sc.nextDouble();
        System.out.println("d=" + d);

        System.out.print("문자열을 입력하세여:");
        String s = sc.next();
        System.out.println("s=" + s);

        System.out.print("첫번째 문자 추출하기");
        char c = s.charAt(0);
        System.out.println("c ="+c);
    }
}