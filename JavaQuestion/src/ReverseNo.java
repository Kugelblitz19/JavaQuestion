public class ReverseNo {
    public static void main(String[]args){
        int n=234;
    int first=n/100;
    n=n%100;
    int second=n/10;;
   int third =n%10;
   int reveerse=third*100 + second*10+ first;
   System.out.println("reverse nUMBER : " +reveerse);



    }
}
