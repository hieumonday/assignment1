
package bai_tap_chuoi;

import java.util.Scanner;

public class wordCount {
    public static int countWords(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }else{
            String[] words = input.split(" ");
            return words.length;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = sc.nextLine();
        int count = countWords(input);
        System.out.println("the sting has:" + count +" words");
    }
}
