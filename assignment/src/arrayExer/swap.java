package arrayExer;

import java.util.Arrays;
import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an int numbers: ");
        int n = sc.nextInt();
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " =");
            temp[i] = sc.nextInt();
        }
        System.out.println("array after import: ");
        System.out.print(Arrays.toString(temp));
        for (int i = 0; i < n / 2; i++) {
            int temps = temp[i];
            temp[i] = temp[n - 1 - i];
            temp[n - 1 - i] = temps;
        }
        System.out.println();
        System.out.println("array after reversal: ");
        System.out.print(Arrays.toString(temp));
    }
}
