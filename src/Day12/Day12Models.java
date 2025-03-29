package Day12;

import java.util.Scanner;

public class Day12Models {
    public static void main(String[] args) {
        Day12Model M = new Day12Model();
        Scanner sc = new Scanner(System.in);
        System.out.print("정사각형의 한변");
        int a = sc.nextInt();
        System.out.print("직사각형의 한변");
        int b = sc.nextInt();
        System.out.print("직사각형의 또다른 변");
        int c = sc.nextInt();
        System.out.print("원주의 길이");
        double d = sc.nextDouble();
        System.out.println("정사각형의 면적"+M.p(a));
        System.out.println("직사각형의 면적"+M.p(b,c));
        System.out.println("원의 면적"+M.p(d));
    }

}
