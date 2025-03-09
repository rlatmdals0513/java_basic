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
            System.out.print("학생 "+(i + 1)+"수학점수:");
            ss[i][0] = sc.nextInt();
            System.out.print("학생 "+(i + 1)+"국어점수:");
            ss[i][1] = sc.nextInt();
            System.out.print("학생 "+(i + 1)+"영어점수:");
            ss[i][2] = sc.nextInt();
        }

        for(int j = 0;j<3;j++){
            int sum = 0;
            for (int k = 0; k < 3; k++) {
                sum += ss[j][k];
            }
            System.out.println("학생"+(j+1)+"총점:"+(sum)+"평균"+(sum / 3.0));
        }
        for(int p = 0;p<3;p++){
            int min = ss[p][0];
            int max = ss[p][0];
            for(int i = 0;i<3;i++){
                if(max<ss[p][i]){
                    max = ss[p][i];
                }
                if(min>=ss[p][i]){
                    min = ss[p][i];
                }
            }
            System.out.println("학생"+(p+1)+"최고점"+max+",최저점"+min);

        }
    }
}
