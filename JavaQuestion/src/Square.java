import java.util.Scanner;

public class Square {
    public static void main(String[]args){
        System.out.println("Enter No whose you want to square:");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int sqrRoot = num*num;
        System.out.println("Square Root of NO is : " + sqrRoot);
    }
}
