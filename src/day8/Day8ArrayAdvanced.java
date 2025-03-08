package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8ArrayAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = {45, 67, 89, 72, 50};
//        System.out.print("50점 이상인 점수");
//        for(int score : scores){
//            if (score >= 50){
//                System.out.print(score + " ");
//            }
//        }

//        Arrays.sort(scores);
//       System.out.print("정렬된 점수:"+Arrays.toString((scores)));
//
//        for (int i = 0;i < scores.length/2;i++) {
//            int temp = scores[i];
//            scores[i] = scores[scores.length - i - 1];
//            scores[scores.length - i - 1] = temp;
//        }
//        System.out.println("내림차슌 정렬 ="+Arrays.toString(scores));

//        int[][] ss = new int[3][4];
//        for(int i = 0;i<3;i++){
//            for(int j = 0;j<4;j++){
//                ss[i][j] = i+j;
//            }
//        }
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 4; j++) {
//                System.out.print(ss[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] ss = new int[3][3];
        for (int i = 0; i < 3; i++) {

            System.out.println("학생 "+(i + 1)+"수학점수:");
            System.out.println("학생 "+(i + 1)+"국어점수:");
            System.out.println("학생 "+(i + 1)+"영어점수:");




        }
    }
}
