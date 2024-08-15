/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cristy
 */
public class PracticeExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> myStudents = createStudents();
        processStudents(myStudents);
    }
    
    public static ArrayList<Student> createStudents()
    {
        String userReply;
        Scanner keyboard = new Scanner(System.in);
        String type, firstName, lastName;
        double gpa;
        int grade, year;
        K12Student aK12Stud;
        CollegeStudent aCollegeStud;
        ArrayList<Student> allStudents = new ArrayList<Student>();
        
        
        
        do
        {
            System.out.println("What is the first name of your student? ");
            firstName = keyboard.nextLine();
            
            System.out.println("What is the last name of your student? ");
            lastName = keyboard.nextLine();
            
            System.out.println("What is the gpa of your student? ");
            gpa = keyboard.nextDouble();
            keyboard.nextLine();
            
            System.out.println("What type of student do you want to create? K or C (K12 or College)");
            type = keyboard.next();
            if (type.equalsIgnoreCase("K"))
            {
                System.out.println("In what grade is your student? ");
                grade = keyboard.nextInt();
                keyboard.nextLine();
                aK12Stud = new K12Student(firstName, lastName, gpa, grade);
                allStudents.add(aK12Stud);
                
            }
            else
            {
                System.out.println("In what year of college is your student? ");
                year = keyboard.nextInt();
                keyboard.nextLine();
                aCollegeStud = new CollegeStudent(firstName, lastName, gpa, year);
                allStudents.add(aCollegeStud);
            }
            System.out.println("Do you want to create more students?");
            userReply = keyboard.nextLine();
        } while (userReply.equals("yes"));
        
        return allStudents;
    }
    
    
    public static void processStudents(ArrayList<Student> myStudents)
    {
        Collections.sort(myStudents);
        
        for (int i= 0; i < myStudents.size(); i++)
        {
            System.out.print(myStudents.get(i));
            System.out.println(" Level is " + myStudents.get(i).determineLevel());
        }
    }
    
}
