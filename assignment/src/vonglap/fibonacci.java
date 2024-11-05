
package vonglap;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n) to display in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        int f0 = 0;
        int f1 = 1;

        if (n <= 0) {
            System.out.println(" enter a positive integer.");
        } else {
            System.out.print("The first " + n + " elements of the Fibonacci sequence are: ");
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(f0);
                } else if (i == 1) {
                    System.out.print(", " + f1);
                } else {
                    int fn = f0 + f1;
                    System.out.print(", " + fn);
                    f0 = f1;
                    f1 = fn;
                }
            }
        }
    }
}