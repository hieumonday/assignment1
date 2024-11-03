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
        int a =  scanner.nextInt();
        System.out.println("enter b:");
        int b =  scanner.nextInt();
        System.out.println("enter c:");
        int c =  scanner.nextInt();
        if(a == 0 && b == 0){
            System.out.println("phuong trinh co6 vo so nghiem");
        
        }else{
           float delta = (float) Math.pow(a,2) - 4*a*c;
           if(delta < 0){
               System.out.println("phuong trinh vo nghiem:");
           }else if( delta == 0){
               float x=(float) -b/(2*a);
               System.out.println("phuong trinh co nghiem kep: "+x);
           }else{
               double x1 = (-b + Math.sqrt(delta))/ 2*a;
               double x2 = (-b - Math.sqrt(delta))/ 2*a;
               System.out.printf("co 2 nghiem rieng biet ,x1=%f ,x2=%f ", x1, x2);
           }
        }
    }
}
