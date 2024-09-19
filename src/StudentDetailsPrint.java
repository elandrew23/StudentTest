/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Salanewt
 */
public class StudentDetailsPrint {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Andrew");
        s1.setSid(1);
        Student s2 = new Student();
        s2.setName("John");
        s2.setSid(2);
        Student s3 = new Student();
        s3.setName("Syd");
        s3.setSid(3);
        s4.setName("Jen");
        s4.setSid(4);
        //Classname[] list = new Classname[##];
        Student[] list = new Student[3];  // array of objects
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        // Objects stored in array\
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            System.out.println(list[i].getSid() + ": " + list[i].getName());
        }
        

    }
}
