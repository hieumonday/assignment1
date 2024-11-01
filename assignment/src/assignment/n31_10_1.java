/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class n31_10_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("enter your age: ");
        int age  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter your Sex: ");
        String sex = scanner.nextLine();
        //bài 1.1
        System.out.println("Enter yearOfBirth: ");
        int yearOfBirthInput = scanner.nextInt();
        Date yearOfBirth= new Date();
        yearOfBirth.setYear(yearOfBirthInput-1900);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String strDate = formatter.format(yearOfBirth);
        scanner.nextLine();
        System.out.println("enter your major: ");
        String major = scanner.nextLine();
        System.out.println("enter your GPA: ");
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("enter your country: ");
        String country = scanner.nextLine();

        System.out.println(" name: " +name);
        System.out.println(" age: " +age);
        System.out.println(" sex: " +sex);
        System.out.println(" yearOfBirth: " +strDate);
        System.out.println(" major: "+major);
        System.out.println(" GPA: "+GPA);
        System.out.println(" country: "+country);
      
        // bai2
         System.out.println("enter your university: ");
         String university = scanner.nextLine();
         System.out.println("string data type: "+ scanner.hasNextLine());
         //bài 3
         System.out.println("enter an int number: ");
         
         if(scanner.hasNextInt()){
             int number  = scanner.nextInt();
               System.out.println("true");
         }else{
             System.out.println("false");
         }
        scanner.close();
    }
}
