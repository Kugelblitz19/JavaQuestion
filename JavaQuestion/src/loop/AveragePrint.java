package loop;

import java.util.Scanner;

public class AveragePrint {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<=10;i++){
            System.out.println("Enter  number");
            sum=sum +sc.nextInt();
        }
        System.out.println("Sum is: " + sum);
    }
}
