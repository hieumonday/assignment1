
package arrayExer;

import java.util.Scanner;

public class temperatures {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("how many day's temperatures");
    int day = scanner.nextInt();
    int[] temps = new int[day];
    double total =0;
    int count = 0;
    for(int i = 0; i< day;i++){
    System.out.println("day "+(i + 1) +"'s high temp:");
    temps[i] = scanner.nextInt();
    total = total + temps[i];
}
    
    double average = total / day;
    for(int i = 0; i< day; i++){
        if(temps[i] > average){
            count ++;
        }
    }
    System.out.println("average temp = " +average);
    System.out.println();
    System.out.println(count+ " days above average");
    scanner.close();
    }   
}
