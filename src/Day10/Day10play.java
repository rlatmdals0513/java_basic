package Day10;

import java.util.Scanner;

public class Day10play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day10Student[] arr = new Day10Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("학생"+(i+1)+"의 이름은?");
            String name = sc.next();
            System.out.print("학생"+(i+1)+"의 나이는?");
            int age = sc.nextInt();
            arr[i] = new Day10Student(name, age);
        }
        for(int i = 0;i<3;i++){
            System.out.println("안녕하세요.저는"+arr[i].age+"살"+arr[i].name+"입니다.");
        }

    }
}
