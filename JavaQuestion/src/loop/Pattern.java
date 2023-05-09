package loop;

public class Pattern {
    public static void main(String[]args){
        int n=4;
        for(int i =0;i<=n;i++){
            System.out.println("*");
            for(int j=0;j<n-1;j++){
                System.out.print("*");
            }
        }
    }
}
