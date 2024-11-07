
package arrayExer;

import java.util.Arrays;
import java.util.Scanner;

public class SumandAverage {
    public static void Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in the array: ");
        int n = sc.nextInt();
        int temp[] = new int[n];
        for(int i= 0;i<n;i++){
            System.out.println("element "+(i+1)+":");
             temp[i] = sc.nextInt();
        }
        System.out.println("arrays after import: ");
        System.out.print(Arrays.toString(temp));
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += temp[i];
        }
        int avr = sum / n;
        System.out.println();
        System.out.println("sum of the element in the array: "+sum);
        System.out.println("average of the element in the array: "+avr);
    }
    public static void main(String[] args){
        SumandAverage.Calculate();
    }
    
}
