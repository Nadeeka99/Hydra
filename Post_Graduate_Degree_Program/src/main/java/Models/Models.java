
package Models;

/**
 *
 * @author AlphaPC
 */
public class Models {
    int ID;
    String name;
    int    fee; 
    String   date;
    String contactnumber;
    
    public Models(int ID,String name,int fee,String date,String contactnumber)
    {
        this.ID=ID;
        this.name=name;
        this.fee=fee;
        this.date=date;
        this.contactnumber=contactnumber;
    
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
    
    public String date()
    {
        return date;
    }
    
    public String contactnumber()
    {
        return contactnumber;
    }
    
}
