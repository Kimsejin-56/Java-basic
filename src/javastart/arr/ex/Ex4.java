package javastart.arr.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg=(double)sum/5;
        System.out.println("입력한 정수의 합계:" + sum);
        System.out.println("입력한 정수의 평균:" + avg);
        }
    }
