package Day12;

import java.util.Scanner;

public class Day12Book2 {
    public static void main(String[] args) {
        Day12librery[] book = new Day12librery[3];
        book[0] = new Day12librery("해리포터","제준");
        book[1] = new Day12librery("반지의 제황","박재준");
        book[2] = new Day12librery("어벤져스","빡재준");
        System.out.println("대여할 책의 코드를 입력하시오.");
        System.out.println("해리포터 = 0,반지의 재왕 = 1,어벤져스 = 2");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        book[a].rentBook();
        book[a].rentBook();
        for(int i = 0;i<3;i++){
            book[i].introduce();
        }


    }
}
