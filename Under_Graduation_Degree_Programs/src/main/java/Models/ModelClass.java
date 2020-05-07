/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Vipun
 */
public class ModelClass {
    
    int ID;
    String name;
    int    fee; 
    String duration;
    String EntryRequirements;
    
    public ModelClass(int ID,String name,int fee,String duration)
    {
        this.ID=ID;
        this.name=name;
        this.fee=fee;
        this.duration=duration;
        this.EntryRequirements=EntryRequirements;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getname()
    {
        return name;
    }
    
    public int getfee()
    {
        return fee;
    }
    
    public String getduration()
    {
        return duration;
    }
    
    public String getEntryRequirements()
    {
        return EntryRequirements;
    }
}
