package Day11;

import java.util.Scanner;

public class Day11otherlogin {
    public static void main(String[] args) {
        Day11svfe example = new Day11svfe();
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하시오");
        String id1 = sc.next();
        example.setId(id1);
        System.out.print("비밀번호 설정하세요");
        String password1 = sc.next();
        example.setPassword(password1);
        System.out.println("느그 아이디"+id1);
        System.out.println("느그 비번"+password1);
        System.out.println("가입완료!");
        System.out.println();
        System.out.println("비밀번호를 변경해서 큰 돈을 벌꺼야");
        System.out.println("로그인 후에 진행됩니다.");
        System.out.print("아이디를 다시 쓰셈");
        String id2 = sc.next();
        System.out.print("느그 비번 다시 쓰셈");
        String password2 = sc.next();
        if(id1.equals(id2) && password1.equals(password2)){
            System.out.println("로그인 성공");
            System.out.print("비밀번호 설정하세요");
            String password3 = sc.next();
            example.setPassword(password3);
            System.out.println("[변경성공] 비밀번호 변경 완료");

        }
        else{
            System.out.println("방금 쓴 것도 모르는 멍청이");
        }


    }
}
