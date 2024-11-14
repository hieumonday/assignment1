
package bai_tap_chuoi;

import java.util.Scanner;

public class occurrences {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String input = sc.nextLine();
        System.out.println("enter the element to seach:");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("the occurrences of a specific character in a string is: "+count);
        
    }
}
