/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen: ");
        int n = scanner.nextInt();
        System.out.println("bang cuu chuong cua "+n);
        for(int i = 1 ; i<=10;i++){
            System.out.println(+n*i);
        }
    }
}
