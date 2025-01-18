package day3;

import java.util.Scanner;

public class Day3operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n =1;


//        System.out.println("n++(후위증가):"+ n++);
//        System.out.println("n (증가후):"+ n);
//        System.out.println("++n(선위증가):"+ ++n);
//        System.out.println("n--(후위감소):"+ n--);
//        System.out.println("n(감소후):"+ n);
//        System.out.println("--n(선위감소):"+ --n);
//        System.out.print("숫자 써라");
//        int num1 = sc.nextInt();
//        System.out.print("한번더 써라");
//        int num2 = sc.nextInt();
//        System.out.println("1>10 그리고 2<20?"+(num1 >10 && num2<20));
//        System.out.println("1>10 or 2<20"+(num1>10 || num2<20));
//        System.out.println("1<10?"+ !(num1 > 10));



//        System.out.println("두값이 다르것 같은데"+(num1 != num2));
//        System.out.println("두값이 같은데 이야 신기하다(짝짝짝)"+(num1 == num2));
//        System.out.println("1 bigger than 2?"+(num1 >num2));
//        System.out.println("1 smaller than 2?"+(num1<num2));
//        System.out.println("1이 2보다 크거나 작냐??"+(num1 >=num2));
//        System.out.println("1이 2보다 작거나 같냐?"+(num1 <=num2));



//        System.out.println("더하기:"+(num1 + num2));
//        System.out.println("빼기:"+(num1 - num2));
//        System.out.println("나누기"+(num1 / num2));
//        System.out.println("나머지"+(num1 % num2));
//        System.out.println("곱하기"+(num1 * num2));


        System.out.println("초기 숫자를 입력하세여;");
        int num  = sc.nextInt();

        num +=5;//num =num +5
        System.out.println("num += 5->"+num);

        num-=3;//num = num-3
        System.out.println("num-= 3 ->"+num);

        num*=2;//num = num*2
        System.out.println("num*= 2 ->"+num);

        num/=4;//num = num/4
        System.out.println("num/= 4 ->"+num);

        num%=3;//num = num-3
        System.out.println("num%= 3 ->"+num);




    }
}


