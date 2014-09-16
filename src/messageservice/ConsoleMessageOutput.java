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
public class ConsoleMessageOutput implements MessageOutput {
    
    public void sendMessage(String message)
    {
        System.out.println(message);
    }
    
}
