package coreJava;

public class ProtectedMemberInheritance {
   protected String name;
   protected void display(){
       System.out.println("I can dance");
   }
   public static class Dog extends ProtectedMemberInheritance{
       public void getInfo(){
           System.out.println("My name is " + name);
       }
   }
   public  static void main (String[]args){
       Dog roony=new Dog();
       roony.name="roony";
       roony.getInfo();
       roony.display();
   }
}
