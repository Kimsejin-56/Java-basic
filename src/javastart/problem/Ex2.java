package javastart.problem;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            sum+=num;
            i++;
        }
        avg = (double) sum / i;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
