import java.util.Scanner;

public class Perimeter {
    public static void main(String[]args){
        System.out.println("Enter length:");
        Scanner sc=new Scanner(System.in);
        int  length  =sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth =sc.nextInt();
        int perimeter = 4*(length+breadth);
        System.out.println("perimter: " +perimeter);

    }
}
