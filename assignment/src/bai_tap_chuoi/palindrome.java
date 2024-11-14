package bai_tap_chuoi;

import java.util.Scanner;
import java.util.Stack;

public class palindrome {

    public static void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string you want:");
        String input = sc.nextLine();
        Stack st = new Stack();
        String reverse = "";
        for (int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
}
            while (!st.isEmpty()) {
                reverse = reverse + st.pop();
            }
            if (input.equals(reverse)) {
                System.out.println("this is a palindrome string");
            } else {
                System.out.println("this is not a palindrome string");
            }
        }
       public static void main(String args[]){
        palindrome.check();
    }
}

    
 
