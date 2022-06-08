package org.example;
/*
Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,org.example.Teacher
Metotlar : Course() , addTeacher() , printTeacher()
 */
public class Courses {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNot;
    public Courses(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;
        int sözlünotu=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher=teacher;;}

        else
            System.out.println("Öğretmen ve ders uyuşmuyor.");
    }
    void printTeacher(){
        this.teacher.print();
    }
}
