package com.naro.codingparactice.ifstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Beakjoon Online judge 1330
 */
public class CompareTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;

        do {
            final String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
        } while (a < -10000 || a > 10000 || b < -10000 || b > 10000);

        if (a > b){
            System.out.println(">");
        } else if (a < b){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        /**
         * 삼항 연산자 쓰기
         */
        //System.out.println(a == b ? "==" : a > b ? ">" : "<");
    }
}
