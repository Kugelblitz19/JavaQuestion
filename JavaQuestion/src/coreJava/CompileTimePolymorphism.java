package coreJava;

public class CompileTimePolymorphism {
    public int add(int a,int b){
        return a+b;

    }
public int add(int a,int b,int c){
        return a+b+c;
}
public static void main(String[]args){
        CompileTimePolymorphism compileTimePolymorphism=new CompileTimePolymorphism();
      System.out.println( compileTimePolymorphism.add(2,3));
    System.out.println( compileTimePolymorphism.add(2,3,7));
}
}

