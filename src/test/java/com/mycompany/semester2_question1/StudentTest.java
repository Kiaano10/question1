/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.semester2_question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author lab_services_student
 */
public class StudentTest {
    
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSaveStudent() {
        
        student.ArrStudentName.add("John Doe");
        student.ArrStudentid.add("12345");
        student.ArrStudentage.add(18);
        student.ArrStudentEmail.add("john.doe@example.com");
        student.ArrStudentcorse.add("Computer Science");

        
        assertEquals(1, student.ArrStudentName.size());
        assertEquals("John Doe", student.ArrStudentName.get(0));
        assertEquals("12345", student.ArrStudentid.get(0));
        assertEquals(18, (int) student.ArrStudentage.get(0));
        assertEquals("john.doe@example.com", student.ArrStudentEmail.get(0));
        assertEquals("Computer Science", student.ArrStudentcorse.get(0));
    }

    @Test
    public void testSearchStudentFound() {
        student.ArrStudentName.add("John Doe");
        student.ArrStudentid.add("12345");
        student.ArrStudentage.add(18);
        student.ArrStudentEmail.add("john.doe@example.com");
        student.ArrStudentcorse.add("Computer Science");

        String searchId = "12345";
        boolean found = false;

        for (int i = 0; i < student.ArrStudentid.size(); i++) {
            if (searchId.equals(student.ArrStudentid.get(i))) {
                found = true;
                assertEquals("John Doe", student.ArrStudentName.get(i));
                assertEquals(18, (int) student.ArrStudentage.get(i));
                assertEquals("john.doe@example.com", student.ArrStudentEmail.get(i));
                assertEquals("Computer Science", student.ArrStudentcorse.get(i));
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    public void testSearchStudentNotFound() {
        String searchId = "99999";
        boolean found = false;

        for (int i = 0; i < student.ArrStudentid.size(); i++) {
            if (searchId.equals(student.ArrStudentid.get(i))) {
                found = true;
                break;
            }
        }

        assertFalse(found);
    }

    @Test
    public void testDeleteStudent() {
        student.ArrStudentName.add("John Doe");
        student.ArrStudentid.add("12345");
        student.ArrStudentage.add(18);
        student.ArrStudentEmail.add("john.doe@example.com");
        student.ArrStudentcorse.add("Computer Science");

        String deleteId = "12345";

        for (int i = 0; i < student.ArrStudentid.size(); i++) {
            if (deleteId.equals(student.ArrStudentid.get(i))) {
                student.ArrStudentid.remove(i);
                student.ArrStudentEmail.remove(i);
                student.ArrStudentName.remove(i);
                student.ArrStudentage.remove(i);
                student.ArrStudentcorse.remove(i);
                break;
            }
        }

        // Verify deletion
        assertEquals(0, student.ArrStudentid.size());
        assertEquals(0, student.ArrStudentName.size());
        assertEquals(0, student.ArrStudentage.size());
        assertEquals(0, student.ArrStudentEmail.size());
        assertEquals(0, student.ArrStudentcorse.size());
    }

    @Test
    public void testDisplayStudents() {
        student.ArrStudentName.add("John Doe");
        student.ArrStudentid.add("12345");
        student.ArrStudentage.add(18);
        student.ArrStudentEmail.add("john.doe@example.com");
        student.ArrStudentcorse.add("Computer Science");

        assertEquals(1, student.ArrStudentid.size());
        assertEquals("12345", student.ArrStudentid.get(0));
        assertEquals("John Doe", student.ArrStudentName.get(0));
        assertEquals(18, (int) student.ArrStudentage.get(0));
        assertEquals("john.doe@example.com", student.ArrStudentEmail.get(0));
        assertEquals("Computer Science", student.ArrStudentcorse.get(0));
    }
    
}
