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
public class HardCodedMessage implements InputMessage {
    
    
    private String message = "Hello World, This is a hard coded message";
            
    public String getMessage()
    {
        return message;
    }
    
    
}
