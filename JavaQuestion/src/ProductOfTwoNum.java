import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[]args){
        System.out.println("Enter First No");
        Scanner sc= new Scanner(System.in);
        float num1=sc.nextFloat();
        System.out.println("Enter Second No");
        int num2=sc.nextInt();
        int product= (int) (num1* num2);
        System.out.println("Product of numbers: " + product);

    }
}
