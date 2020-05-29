/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author MANUJA
 */
public class ModelClass {
    
    public String MemberId;
    public String Name;
    public String NIC; 
    public String DateOfBirth;
    public int Age;
    public String Address;
    public int TelephoneNumber;
    public String EmailAddress;
    public String AsignedTeam;
    public String AssignedTask;
    public float TimeAvailable;
 
    public ModelClass (String MemberId,String Name,String NIC,String DateOfBirth,int Age, String Address,int TelephoneNumber,String EmailAddress,String AsignedTeam,String AssignedTask,float TimeAvailable)
    {
        this.MemberId=MemberId;
        this.Name=Name;
        this.NIC=NIC;
        this. DateOfBirth= DateOfBirth;
        this.Age=Age;
        this.Address=Address;
        this.TelephoneNumber=TelephoneNumber;
        this.EmailAddress=EmailAddress;
        this. AsignedTeam= AsignedTeam;
        this.AssignedTask=AssignedTask;
        this.TimeAvailable=TimeAvailable;
        

    }
    
    public String getMemberId()
    {
        return MemberId;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getNIC()
    {
        return NIC;
    }
    
    public String getDateOfBirth()
    {
        return DateOfBirth;
    }
    
    public int getAge()
    {
        return Age;
    }
    
    public String getAddress()
    {
        return Address;
    }
    
    public int getTelephoneNumber()
    {
        return TelephoneNumber;
    }

    public String getEmailAddress()
    {
        return EmailAddress;
    }

    public String getAsignedTeam()
    {
        return AsignedTeam;
    }

    public String getAssignedTask()
    {
        return AssignedTask;
    }

    public float getTimeAvailable()
    {
        return TimeAvailable;
    }

    
}
