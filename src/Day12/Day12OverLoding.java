package Day12;

import java.util.Scanner;

public class Day12OverLoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day12calator cal = new Day12calator();
//        System.out.println("정수의 합:"+cal.add(3,5));
//        System.out.println("세정수의 합:"+cal.add(3,5,7));
//        System.out.println("두실수의 합:"+cal.add(3.5,5.2));

        System.out.println("두상품의 총액:"+cal.add(12500,12500));
        System.out.println("세 상품의 총액:"+cal.add(15000,15000,15000));
        System.out.println("두 상품의 총액(실수):"+cal.add(10.5,10.4));
        System.out.print("연필(1500원) 몇개 구매 할건가요?");
        int a = sc.nextInt();
        System.out.println("연필 총액"+cal.add(a));
    }
}
