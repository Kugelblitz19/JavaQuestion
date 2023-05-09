package coreJava;

public class StaticMethod {
    static String k="kunal";
    String m="manik";
    void simpleDisplay(){
        System.out.println(k);
        System.out.println(m);
    }
    static void staticDisplay(){
        System.out.println(k);

    }
    public static void main(String[]args){
        StaticMethod sm=new StaticMethod();
        sm.simpleDisplay();
        staticDisplay();
    }
}
