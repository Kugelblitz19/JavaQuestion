import java.util.Scanner;

public class PurchaseTheCloth {
    public static void main(String[]args){
        System.out.println("Enter the quanntity");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if((x*100>1000)){
            System.out.println("You get a discount of" + (0.1*x*100)+  " and your total cost is : " +
                    (x*100-(0.1*x*100)));
        }else{
            System.out.println("No Discount");
        }
    }
}
