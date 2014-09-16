
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import javax.swing.*;

/**
 *
 * @author emanion
 */
public class SwingMessageOutput  implements MessageOutput {
    
    public void sendMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }
    
    
}
