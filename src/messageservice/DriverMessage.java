/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author emanion
 */
public class DriverMessage implements InputMessage {
    
    
    private String message = "Nothing to say yet";
    
    public DriverMessage(String message)
    {
        if (message == null || message.isEmpty())
        {this.message = "constructor has nothing to say";}
        else
        {this.message = message;}
        
    }
            
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        if (message == null || message.isEmpty())
        {this.message = "still nothing to say";}
        else
        {this.message = message;}
            
    }
    
}
