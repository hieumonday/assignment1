package code_yt.vong_lap;

import java.util.Scanner;

public class SumofDigits {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an int number: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum = sum + a;
            n = n / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}

