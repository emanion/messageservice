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
public class MessageService {

	private InputMessage inputMessage;
	private OutputMessage outputMessage;
    /**
     * @param args the command line arguments
     */
    public MessageService(InputMessage getMessage, OutputMessage outputMessage)
    {
        this.inputMessage = getMessage;
        this.outputMessage = outputMessage;
    }
    
    public void displayMessage()
    {
        String message = inputMessage.getMessage();
        outputMessage.sendMessage(message);
    }
}
