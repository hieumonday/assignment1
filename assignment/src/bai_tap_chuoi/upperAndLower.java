
package bai_tap_chuoi;

import java.util.Scanner;

public class upperAndLower {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String input = sc.nextLine();
        String tam = convertCase(input);// chuyển các ký tự trong chuôĩ input va lưu kết quả ở tam
        System.out.println("original string:"+input);
        System.out.println("String after Upper and Lower: " + tam);
    }
    public static String convertCase( String s){
        
        StringBuilder kq = new StringBuilder(s.length());//stringbuilder độ dài bằng chuỗi đầu vao 
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                kq.append(Character.toLowerCase(ch));
            }else{
                kq.append(Character.toUpperCase(ch));
            }
        }
        return kq.toString();
    }
}
