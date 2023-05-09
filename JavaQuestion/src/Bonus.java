import java.util.Scanner;

public class Bonus {
    public static void main(String[]args){
        System.out.println("Enter current salary:");
        Scanner sc=new Scanner(System.in);
        int salary =sc.nextInt();
        System.out.println("Enter your working year:");
        int year= sc.nextInt();
        double bonus=0.0;
        if(year>5){
            System.out.println("Monyhly salary is " + salary + ".Bonus added " + (bonus =salary *0.05) +
                    " Total salary becomes : " + (bonus+salary));
        }else{
            System.out.println(salary);
        }
    }
}
