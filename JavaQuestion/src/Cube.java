import java.util.Scanner;

public class Cube {
    public static void main(String[]args){
    System.out.println("Enter No which you want to cube:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int cube = num*num*num;
        System.out.println("Cube is :" + cube);
    }
}
