
package arrayExer;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
    public static void sort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the int number of the element in the array: ");
        int n = sc.nextInt();
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("element "+(i+1)+ ":");
            temp[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println();
        System.out.println("array after sort: ");
        System.out.print(Arrays.toString(temp));
    }
    public static void main(String[] args){
        SortTheArray.sort();
    }
}
