
package bai_tap_chuoi;

import java.util.Scanner;

public class longest {
    public static String find_longest_word(String input){
        if(input == null || input.isEmpty()){
            return "";
        }
        String[] words = input.split(" ");
        String longestWord="";
        for(String a : words){
            if(a.length()>longestWord.length()){
                longestWord = a;
            }
        }
        return longestWord;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = sc.nextLine();
        System.out.println("string have word longest is: "+longest.find_longest_word(input));
    }
}
