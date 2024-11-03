/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_yt;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ptb2 {
    public static void main(String[] args){
        System.out.println("giai phuong trinh bac 2 ax^2 + bx +c =0:" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        int a = scanner.nextInt();
        System.out.println("enter b:");
        int b = scanner.nextInt();
        System.out.println("enter c:");
        int c = scanner.nextInt();
        if(a == 0 && b == 0){
            System.out.println("phuong trinh co vo so nghiem");
        } else if(a == 0 && b != 0){
            System.out.println("phuong trinh vo nghiem");
        }else{
            float x =(float) -b/a;
            
            System.out.println("phuong trinh co nghiem la: " +x);
        }
    }
}
