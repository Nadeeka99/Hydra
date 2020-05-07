/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewEvent;

/**
 *
 * @author Shavindya 
 */
public class NewEvents {
    String EventName;
    String Description;
    String Contact;
    String TimeDate;
    String Keyword;
    

public NewEvents(String EventName,String Description,String Contact,String TimeDate,String Keyword)
{
    this.EventName=EventName;
    this.Description=Description;
    this.Contact=Contact; 
    this.TimeDate=TimeDate; 
    this.Keyword=Keyword;
               
}

public String getEventName(){
    
    return EventName;
}
public String getDescription(){
    
    return Description;
   
}
public String getContact(){
    
    return Contact;
}
public String TimeDate(){
    
    return TimeDate;
}
public String Keyword(){
    
    return Keyword;
}

}
