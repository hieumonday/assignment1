package bai_tap_chuoi;

import java.util.Arrays;
import java.util.Scanner;

public class split {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = sc.nextLine();
        String[] wordsArray = splitWord(input);// lưuu kq vao mảng
        System.out.println("original string: " + input);
        System.out.println("string after words: " + Arrays.toString(wordsArray));
    }
    public static String [] splitWord(String input){
        return input.split(" ");
    }
}
