
package bai_tap_chuoi;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static String removeSpace(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        String a = input.trim();
        return a.replaceAll("\\s+", " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = sc.nextLine();
        System.out.println("string after remove extra space:"+RemoveExtraSpaces.removeSpace(input));
    }
}
