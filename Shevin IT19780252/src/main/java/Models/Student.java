package Models;


public class Student {
        
    String Name;
    String DOB;
    String NIC;
    String Address;
    String Gender;
    String Contact;
    String Email;
    String Occupation;
    String Course;
    
    public Student(String Name,String DOB,String NIC,String Address,String Gender,String Contact,String Email,String Occupation,String Course)
    {
        this.Name=Name;
        this.DOB=DOB;
        this.NIC=NIC;
        this.Address=Address;
        this.Gender=Gender;
        this.Contact=Contact;
        this.Email=Email;
        this.Occupation=Occupation;
        this.Course=Course;
        
    }
    public String getName(){
        return Name;
    }
     public String getDOB(){
        return DOB;
    }
        public String getNIC(){
        return NIC;
    }
    public String getAddress(){
        return Address;
    }
    public String getGender(){
        return Gender;
    }
    public String getContact(){
        return Contact;
    }
    public String getEmail(){
        return Email;
    }
    public String getOccupation(){
        return Occupation;
    }
    public String getCourse(){
        return Course;
    }
    
    
}
