
package vonglap;

import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random  r = new Random();
        int ran = r.nextInt(50) + 1;
        int n = 0 ;
        System.out.println("nhap 1 so ngau nhien tu 1 den 50: ");
        while(n != ran) {
            n = scanner.nextInt();
            if(n < ran){
                System.out.println("so ban nhap da nho hon roi!");
            }else if(n>ran){
                System.out.println("so ban nhap lon hon roi");
            }else{
                System.out.println("ban doan dung roi");
            }    
        }
    }
    
}
