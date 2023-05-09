import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[]args){
        System.out.println("enter the lengtth");
        Scanner sc=new Scanner(System.in);
        int length =sc.nextInt();
        System.out.println("enter the breadth");
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("It is sqaure:");
        }else{
            System.out.println("It is not sqaure:");
        }


    }
}
