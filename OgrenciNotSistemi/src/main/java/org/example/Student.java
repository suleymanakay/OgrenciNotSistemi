package org.example;
/*
Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 */
public class Student {
    Courses c1;
    Courses c2;
    Courses c3;
    String name;
    String stuNo;
    String classes;
    double avarege;

    Boolean isPass;

    public Student(String name, String stuNo,String classes,Courses c1,Courses c2,Courses c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarege=0.0;
        this.isPass=false;
    }
    public void calcAverage(){
        double n1 = (this.c1.note*0.8 + this.c1.sozluNot*0.2);
        double n2 = (this.c2.note*0.7 + this.c2.sozluNot*0.3);
        double n3 = (this.c3.note*0.6 + this.c3.sozluNot*0.4);
        this.avarege = (n1 + n2 + n3)/3;
    }
    void addBulkExamNote(int note1,int note2,int note3,int sNote1,int sNote2, int sNote3){
        System.out.println("=============");
        if((note1>=0 && note1<=100)&&(sNote1 >= 0 && sNote1 <= 100))
       this.c1.note=note1;

        if((note2>=0 && note2<=100)&&(sNote2 >= 0 && sNote2 <= 100))
       this.c2.note=note2;

        if((note3>=0 && note3<=100)&&(sNote3 >= 0 && sNote3 <= 100))
       this.c3.note=note3;
    }
    void printNote(){
        System.out.println(c1.name+"Notu: "+c1.note);
        System.out.println(c2.name+"Notu: "+c2.note);
        System.out.println(c3.name+"Notu: "+c3.note);
        System.out.println("Ortalamanız: "+this.avarege);
    }
    void setIsPass(){
        calcAverage();
        if(this.avarege>=60) {
            System.out.println("Geçtiniz...");
            this.isPass = true;
        }
        else {
            System.out.println("Kaldınız...");
            this.isPass=false;
        }
        printNote();
    }
}
