/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class ModelClass {
    int StudentID;
    String StudentName;
    String CourseDuration; 
    String Requirements;
    String EligibleCourses;
    int CourseFee;


    public ModelClass( int StudentID, String StudentName, String CourseDuration, String Requirements, String EligibleCourses, int CourseFee)
    {       
            this.StudentID=StudentID;
            this.StudentName=StudentName;
            this.CourseDuration=CourseDuration;
            this.Requirements=Requirements;
            this.EligibleCourses=EligibleCourses;
            this.CourseFee=CourseFee;
    }

    public int getStudentID()
    {
        return StudentID;
    }

    public String getStudentName()
    {
        return StudentName;
    }

    public String getCourseDuration()
    {
        return CourseDuration;
    }

    public String getRequirements()
    {
        return Requirements;
    }

    public String getEligibleCourses()
    {
        return EligibleCourses;
    }

    public int getCourseFee()
    {
        return CourseFee;
    }

}



