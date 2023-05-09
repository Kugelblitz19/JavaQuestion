package coreJava;

public class RunTimePolymorphism {
  public void name(){
      System.out.println("My name is Kunal:");
  }
  static class detail extends RunTimePolymorphism{
      public void name(){
          System.out.println("My name is Aditya:");
      }

  }
  public static void main(String[] args){
      RunTimePolymorphism runTimePolymorphism=new detail();
      runTimePolymorphism.name();
      runTimePolymorphism =new RunTimePolymorphism();
      runTimePolymorphism.name();

  }
}
