package coreJava;

public class OverloadedConstructor {
    String variable1,variable2,variable3;
    public void Friend(String friend1,String friend2 ){
        variable1=friend1;
        variable1=friend2;

    }
public void Friend(String friend1){
        variable1=friend1;

}
public void Hospital(double salary){
        variable1= String.valueOf(salary);
}

}
