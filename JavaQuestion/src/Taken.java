public class Taken {
    public static void main(String[]args){
      int first,second,third,fourth,n=5696,result;
     first=(n/1000);
     n=(n %1000)+2;
        second=(n/100);
        n=(n %100)+2;
        third=(n/10);
        n=(n %10)+2;
        fourth=n/1;
        n=(n %1)+2;
        result=(first*1000)  + (second*100) + (third*10) + fourth;
        System.out.println(result);




    }
}
