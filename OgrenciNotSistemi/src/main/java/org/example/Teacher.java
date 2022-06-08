package org.example;
/*
org.example.Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : org.example.Teacher()
 */
public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("isminiz: "+this.name);
        System.out.println("Tel-no: "+this.mpno);
        System.out.println("branşınız: "+this.branch);
    }
}
