
package bai_tap_chuoi;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  string you want:");
        String input = sc.nextLine();
        Stack stack = new Stack();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));            
        }
        String reverse = "";
        while(!stack.isEmpty()){
            reverse = reverse + stack.pop();
        }
        System.out.println("the string after reverse:" +reverse);
}
}
