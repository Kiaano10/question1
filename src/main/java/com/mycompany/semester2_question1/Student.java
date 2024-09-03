/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2_question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Student {
    //declare arrays

     ArrayList<String> ArrStudentName = new ArrayList<>();
     ArrayList<String> ArrStudentid = new ArrayList<>();
     ArrayList<Integer> ArrStudentage = new ArrayList<>();
     ArrayList<String> ArrStudentEmail = new ArrayList<>();
     ArrayList<String> ArrStudentcorse = new ArrayList<>();

    public void SaveStudent() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter student name:");
        String StudentName = kb.next();
        ArrStudentName.add(StudentName);

        System.out.println("Please enter student ID:");
        String ID = kb.next();
        ArrStudentid.add(ID);

        System.out.println("Please enter student age:");
        int Age = kb.nextInt();
        //check age
        while (Age < 16) {
            System.out.println("You have entered an incorrect student age!!!\nPlease re-enter age:");
            Age = kb.nextInt();
        }
        ArrStudentage.add(Age);

        System.out.println("Please enter student email:");
        String Email = kb.next();
        ArrStudentEmail.add(Email);

        System.out.println("Please enter student course:");
        String Course = kb.next();
        ArrStudentcorse.add(Course);

        System.out.println("Student details saved successfully!");
    }

    public void Search() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Search student by student ID:");
        String StudentID = kb.next();

        boolean found = false;
        for (int i = 0; i < ArrStudentid.size(); i++) {
            if (StudentID.equals(ArrStudentid.get(i))) {
                System.out.println("Student ID: " + ArrStudentid.get(i)
                        + "\nStudent Name: " + ArrStudentName.get(i)
                        + "\nStudent Age: " + ArrStudentage.get(i)
                        + "\nStudent Email: " + ArrStudentEmail.get(i)
                        + "\nStudent Course: " + ArrStudentcorse.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + StudentID + " was not found.");
        }
    }

    public void Delete() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Search student by student ID to delete:");
        String StudentID = kb.next();

        boolean found = false;
        //iterate through array
        for (int i = 0; i < ArrStudentid.size(); i++) {
            if (StudentID.equals(ArrStudentid.get(i))) {
                System.out.println("Are you sure you want to delete this student? (Y/N)");
                String Option = kb.next();
                if (Option.equalsIgnoreCase("Y")) {
                    ArrStudentid.remove(i);
                    ArrStudentEmail.remove(i);
                    ArrStudentName.remove(i);
                    ArrStudentage.remove(i);
                    ArrStudentcorse.remove(i);
                    System.out.println("Student " + StudentID + " was deleted successfully.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + StudentID + " was not found.");
        }
    }

    public void Display() {
        if (ArrStudentid.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        int students = 1;
        for (int i = 0; i < ArrStudentid.size(); i++) {
            System.out.println("Student " + students
                    + "\n----------------\nStudent ID: " + ArrStudentid.get(i)
                    + "\n----------------\nStudent Name: " + ArrStudentName.get(i)
                    + "\n----------------\nStudent Age: " + ArrStudentage.get(i)
                    + "\n----------------\nStudent Email: " + ArrStudentEmail.get(i)
                    + "\n----------------\nStudent Course: " + ArrStudentcorse.get(i));
            students++;
        }
    }
}