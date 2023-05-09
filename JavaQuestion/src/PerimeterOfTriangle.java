import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[]args){
        System.out.println("Enter first sides:");
        Scanner sc=new Scanner(System.in);
        int side1 =sc.nextInt();
        System.out.println("Enter second sides:");
        int side2=sc.nextInt();
        System.out.println("Enter third sides:");
        int side3 =sc.nextInt();
        int perimeter=side1+side2+side3;
        System.out.println("perimater " + perimeter);
    }
}
