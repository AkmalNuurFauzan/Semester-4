
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class Main {
    public static void main(String[] args) {
//      Data Mahasiswa
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String name = input1.nextLine();
        System.out.print("Masukkan Alamat : ");
        String address = input2.nextLine();
        Student s1 = new Student(name, address);
        System.out.println("\nDetail Data Mahasiswa\n");
        s1.addCourseGrade("Data Analystic", 88);
        s1.addCourseGrade("Pemrograman Berbasis Objek", 90);
        s1.printGrade();
        System.out.println("Average is " + s1.getAverageGrade());
        
//      Data Dosen
        Scanner inputName = new Scanner(System.in);
        Scanner inputAddr = new Scanner(System.in);
        System.out.print("Masukkan Nama Dosen : ");
        String nameDosen = inputName.nextLine();
        System.out.print("Masukkan Alamat Dosen : ");
        String AddrDosen = inputAddr.nextLine();
        Teacher t1 = new Teacher(nameDosen, AddrDosen);
        System.out.println("\nDetail Data Dosen\n");
        System.out.println(t1);
        String[] courses = {"IM101","IM102", "IM103"};
        for(String course: courses){
            if(t1.addCourse(course)){
                System.out.println(course + " added");
            }else{
                System.out.println(course + " cannot added");
            }
        }
//        for(String course: courses){
//            if(t1.removeCourse(course)){
//                System.out.println(course + " removed");
//            } else {
//                System.out.println(course + " cannot removed");
//            }
//        }
    }
}
