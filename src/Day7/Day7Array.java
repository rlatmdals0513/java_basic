package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Day7Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char [] chars= new char[4];
//        chars[0] = 'c';
//        chars[1] ='h';
//        chars[2] = 'a';
//        chars[3] = 'r';

//        int[] ints = {85,90,78,92,88};

//        System.out.print("학생 수를 입력하시오.");
//        int num1 = sc.nextInt();
//        int[] nums = new int[num1];
//        int sum = 0;
//        for(int j=0;j<num1;j++){
//            System.out.print("학생들의 점수는? 학생"+(j+1)+":");
//            int i =sc.nextInt();
//            nums[j] =i;
//            sum += nums[j];
//        }
//        System.out.print("평균:"+(sum/num1));

//        System.out.print("숫자 개수");
//        int i = sc.nextInt();
//        int [] num = new int[i];
//        for(int j = 0;j<i;j++){
//            System.out.print("숫자 입력");
//            int num1 = sc.nextInt();
//            num[j] = num1;
//        }
//        int max = num[0];
//        for(int s = 0;s<i;s++){
//            if(num[s]>max){
//                max = num[s];
//        }
//        }
//        System.out.println("최대값"+max);
//        int little = num[0];
//        for(int w = 0;w<i;w++){
//           if(num[w]<little){
//               little = w;
//           }
//        }
//        System.out.print("최소값"+little);

//        String[] strings = {"Hello", "wolrd", "!!"};
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//        int i = 1;
//        for (String yyy : strings) {
//            System.out.println(i++ + "번 째 반복:  " + yyy);
//        }

        System.out.print("숫자 개수");
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int j = 0 ; j < i; j++) {
            System.out.print("숫자를 하나 입력해주세요: ");
            arr[j] = sc.nextInt();
        }

        // gfh
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
    }
}
