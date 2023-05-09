import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter gender:");
        String gender = sc.nextLine();
        boolean martialStatus = sc.hasNextBoolean();
        if (gender=="male" && age >= 20 || age <= 40) {
            System.out.println("He can Work Anywhere:");

        } else if (gender=="male" && age>=40 ||age<=60) {
            System.out.println("He will work urban areas only:");

        }else {
            System.out.println("ERROR!!");
        }
    }
}
