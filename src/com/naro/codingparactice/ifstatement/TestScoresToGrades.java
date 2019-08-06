package com.naro.codingparactice.ifstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Beakjoon Online Judge
 *  9498.시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 **/

public class TestScoresToGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score;
        final char grade;

        do {
            score = Integer.parseInt(br.readLine());
        } while (score < 0 || score >100);

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);

        br.close();

        /**
         * switch-case 구문 활용
         */
//        char a;
//        switch(score / 10) {
//            case 10:
//            case 9: a = 'A';
//                break;
//            case 8: a = 'B';
//                break;
//            case 7: a = 'C';
//                break;
//            case 6: a = 'D';
//                break;
//            default: a = 'F';
//                break;
//        }
//        System.out.println(a);
    }
}
