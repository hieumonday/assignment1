
package arrayExer;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheOccurrences {
    public static void Occurrences(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the elment in the array: ");
        int n = sc.nextInt();
        int temp[] = new int [n];
        for(int i = 0;i<n;i++){
            System.out.println("element "+(i+1)+" :");
            temp[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(temp));
        System.out.println();
        System.out.println("enter the element special: ");
        int s = sc.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(temp[i] == s){
                count++;
            }
        }
        System.out.println("the number of times" +s+" appears in the array:"+count);
    }
    public static void main(String[] args){
       CountTheOccurrences.Occurrences();
    }
}
