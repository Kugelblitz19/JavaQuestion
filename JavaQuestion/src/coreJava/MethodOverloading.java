package coreJava;

public class MethodOverloading {
    static int sum(int a,int b ){
        return a +b;

    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
        System.out.println("With two argument:");
        System.out.println(sum(4,6));
        System.out.println("With three argument:");
        System.out.println(sum(6,7,8));
    }
}
