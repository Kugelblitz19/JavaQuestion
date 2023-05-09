package loop;

import java.util.Scanner;

public class Table {
    public static void main(String[]args){
        System.out.println("Enter no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println( no + "*" + i + "\t=\t" +(no*i));
        }

    }
}
