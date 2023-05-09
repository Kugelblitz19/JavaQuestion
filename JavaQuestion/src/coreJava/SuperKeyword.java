package coreJava;

public class SuperKeyword {
    public void eat(){
        System.out.println("I can eat");
    }
    public static class Dog extends SuperKeyword{
        @Override
        public void eat(){
            super.eat();
            System.out.println("I can eat too");
        }
public void bark(){
    System.out.println("I can bark");
}
    }
    public static void main(String []args){
        Dog roony=new Dog();
        roony.bark();
        roony.eat();
    }
}
