package com.nie;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查询的成绩");
        int score = sc.nextInt();
        if(score>=60){
            System.out.println("合格");
        }else
            System.out.println("不合格");

    }

}
