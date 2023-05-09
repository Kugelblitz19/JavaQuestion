package coreJava;

public class Inheritance {
    public void eat(){
        System.out.println("I can Eat:");
    }
    static class Dog extends Inheritance{
        @Override
        public void eat(){
            System.out.println("I can Eat too:");
        }
    public void bark(){
        System.out.println("I can bark");
    }
    }
    public static void main(String[]args){
        Dog labroder=new Dog();
        labroder.eat();
        labroder.bark();

    }
}
