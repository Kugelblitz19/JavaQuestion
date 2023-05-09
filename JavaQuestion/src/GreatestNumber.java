import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[]args){
        System.out.println("Enter the first Number:");
        Scanner sc=new Scanner(System.in)  ;
    int firstNumber=sc.nextInt();
        System.out.println("Enter the second Number:");
        int secondNumber=sc.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(" the first Number is greater:" + firstNumber);
        }else{
            System.out.println(" second  Number is greater:" + secondNumber);
        }
    }
}
