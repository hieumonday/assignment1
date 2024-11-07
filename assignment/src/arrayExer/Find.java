
package arrayExer;

import java.util.Arrays;
import java.util.Scanner;


public class Find {
    public static void findMaxAndMin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int temp[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.println("element "+(i+1)+ ": ");
        temp[i] = sc.nextInt();
    }
    System.out.println("array after import: ");
    System.out.print(Arrays.toString(temp));
    System.out.println();
    int max = temp[0];
    int min = temp[0];
    for(int i = 1;i<n;i++){
        if(temp[i] > max){
             max = temp[i];
        }
        if(temp[i] < min){
           min = temp[i];
        }
    }
    
    System.out.println("the largest element in the array: " +max);
    System.out.println("the smallest element in the array: " +min);
}
    public static void main(String[] args){
        Find.findMaxAndMin();
    }
}
