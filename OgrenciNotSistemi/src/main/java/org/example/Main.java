package org.example;
/*
Öğrenci Not Sistemi

Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,org.example.Teacher
Metotlar : Course() , addTeacher() , printTeacher()

org.example.Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : org.example.Teacher()

Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ahmet", "5000000","MTK");
        Teacher t2=new Teacher("mehmet", "4000000","FZK");
        Teacher t3=new Teacher("veli", "3000000","KMY");

        Courses Mk =new Courses("Matematik","1","MTK");
        Mk.addTeacher(t1);
        Courses Fk=new Courses("Fizik","2","FZK");
        Fk.addTeacher(t2);
        Courses Km=new Courses("Kimya","3","KMY");
        Km.addTeacher(t3);

        Student a1= new Student("ahmet","78","4",Mk,Fk,Km);
        a1.addBulkExamNote(100,75,65,85,75,85);
        a1.setIsPass();
        Student a2= new Student("mehmet","44","4",Mk,Fk,Km);
        a2.addBulkExamNote(100,100,100,100,54,75);
        a2.setIsPass();


    }
}