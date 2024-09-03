/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semester2_question1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Semester2_Question1 {

    public static void main(String[] args) {
        int option, option2;
        Student s1 = new Student();
        
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter (1) to launch menu or any other key to exit");
        option = kb.nextInt();
        
        
        while   (option ==1) {
            if (option==1){
                System.out.println("Please select one of the following items: \n(1)Capture new student "
                    + "\n(2)Search for student\n(3) Delete a new student\n(4)Print student report\n(5)Exit application");
            option2= kb.nextInt();
            
            switch(option2){
                case 1:
                    s1.SaveStudent();
                    break;
                
                case 2:
                    s1.Search();
                    break;
                    
                case 3:
                    s1.Delete();
                    break;
                    
                case 4:
                    s1.Display();
                    break;
                    
                case 5:
                    break;
                
            }
        
            
            System.out.println("Enter (1) to launch menu or any other key to exit");
        option = kb.nextInt();
            
           
        }
           
            
        }
         System.out.println("Exiting....");
            
        
    
        
    
    }
    // Joyce Farrell.(2019) Java Programming.9th ed
}
