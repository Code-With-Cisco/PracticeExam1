/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceexam1;

/**
 *
 * @author cristy
 */
public class K12Student extends Student  {
    private int grade; 
    
    public K12Student(String firstName, String lastName, double gpa, int gradeLevel)
    {
       super(firstName, lastName, gpa);
       this.grade = grade;
    }
    
    public int getGradeLevel()
    {
        return grade;
    }
    
    public void setGradeLevel(int aGrade)
    {
        this.grade = aGrade;
    }
    
    public String determineLevel()
    {
        String level;
        
        if (grade >= 0 && grade <=5)
        {
            level = "1. elementary";
        }
        else if (grade >= 6 && grade <=8)
        {
            level = "2. middle";
        }
        else
        {
            level = "3. high";
        }
        return level;
        
    }
    
    public int compareTo(Student other)
    {
        if (other instanceof K12Student)
        {
            K12Student otherK12 = (K12Student) other;

            if (this.determineLevel().compareTo(otherK12.determineLevel()) >= 1) 
            {
                return 1;
            }
            else if (this.determineLevel().compareTo(otherK12.determineLevel()) < 1)
            {
                return -1;
            }
            else  //since they are same level, compare by last name
            {
                return this.getLastName().compareTo(otherK12.getLastName());
            }
        }
        else
            return 0;
        
    }
    
    
}
