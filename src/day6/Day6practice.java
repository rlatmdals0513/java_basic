package day6;

import java.util.Scanner;

public class Day6practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =1; i<=10;i++){
            if(i%2==0){
                System.out.println("i = " + i);
                continue;
            }
        }
    }
}
