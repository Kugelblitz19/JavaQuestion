import java.util.Scanner;

public class StudentEligble {
    public static void main(String[]args){
    System.out.println("Enter No of classes Held:");
    Scanner sc=new Scanner(System.in);
    float noOfClassesHeld =sc.nextInt();
        System.out.println("Enter No of classes attend:");
        float noOfClassesAttend =sc.nextInt();

        if(noOfClassesAttend/noOfClassesHeld*100>75){
            System.out.print("You are eligible:"+ noOfClassesAttend/noOfClassesHeld*100 + "Percentage of attendance:");
        }else {
            System.out.println("You are not eligible:");
        }
    }
}

