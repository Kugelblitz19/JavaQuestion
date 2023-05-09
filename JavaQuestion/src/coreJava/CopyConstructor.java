package coreJava;

public class CopyConstructor {


        String department;
        String service;
        CopyConstructor(CopyConstructor cc) {
            this.department = cc.department;
            this.service = cc.service;


        }

}
