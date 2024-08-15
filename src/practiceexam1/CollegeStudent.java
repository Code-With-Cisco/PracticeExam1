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
public class CollegeStudent extends Student  {
    private int year;
    
    public CollegeStudent(String firstName, String lastName, double gpa, int year)
    {
        super(firstName, lastName, gpa);
        this.year = year;
    }
    
    public String determineLevel()
    {
        String level;
        
        if (year == 1)
        {
            level = "4. freshman";
        }
        else if (year == 2)
        {
            level = "5. sophmore";
        }
        else if (year == 3)
        {
            level = "6. junior";
        }
        else
        {
            level= "7. senior";
        }
        
        return level;
    }
    
    public int compareTo(Student other)
    {
        if (other instanceof CollegeStudent)
        {
            CollegeStudent otherCollege = (CollegeStudent) other;

            if (determineLevel().compareTo(otherCollege.determineLevel()) >= 1)
            {
                return 1;
            }
            else if (determineLevel().compareTo(otherCollege.determineLevel()) < 1)
            {
                return -1;
            }
            else
            {
                return this.getLastName().compareTo(otherCollege.getLastName());
            }
        }
        
        return 0;
        
    }
    
}
