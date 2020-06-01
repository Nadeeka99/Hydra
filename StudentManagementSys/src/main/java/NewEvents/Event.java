/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewEvents;

/**
 *
 * @author Shavindya
 */
class Event {
    
    private String EventName,Description,EventTime,Keyword;
    private String ContactNumber;
    
    public Event(String EventName, String Description,String ContactNumber,String EventTime,String Keyword)
    {
    this.EventName=EventName;
    this.Description=Description;
    this.ContactNumber=ContactNumber; 
    this.EventTime=EventTime; 
    this.Keyword=Keyword;
               
}

public String getEventName(){
    
    return EventName;
}
public String getDescription(){
    
    return Description;
   
}
public String getContactNumber(){
    
    return ContactNumber;
}
public String getEventTime(){
    
    return EventTime;
}
public String getKeyword(){
    
    return Keyword;
}

}