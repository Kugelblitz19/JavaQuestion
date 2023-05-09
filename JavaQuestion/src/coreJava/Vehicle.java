package coreJava;

public class Vehicle {
    void make(){
        System.out.println("Heavy Driver:");
    }
    public static class Truck extends Vehicle{
        void make(){
            System.out.println("Transport vehicle for heavy duty");
        }
    }
    public static void main(String[]args){
        Vehicle v1=new Truck();
        v1.make();

    }
}
