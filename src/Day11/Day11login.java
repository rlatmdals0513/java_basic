package Day11;

import java.util.Scanner;

public class Day11login {
    public static void main(String[] args) {
        Day11savefile example = new Day11savefile();
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하시오");
        String id1 = sc.next();
        example.setId(id1);
        System.out.print("비밀번호 입력하기");
        String password = sc.next();
        example.setPassword(password);
        System.out.println("당신의 아이디:"+id1);
        System.out.println("느그 비밀번호:"+password);
        System.out.println("으로 가입 완료");



    }
}
