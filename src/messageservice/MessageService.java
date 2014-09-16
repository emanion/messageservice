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

    private MessageInput inputMessage;
    private MessageOutput outputMessage;

    /**
     * @param args the command line arguments
     */
    public MessageService(MessageInput inputMessage, MessageOutput outputMessage) {
        setInputMessage(inputMessage);
        setOutputMessage(outputMessage);
    }

    public MessageInput getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(MessageInput inputMessage) {
        if (inputMessage == null)
        {
            inputMessage = new HardCodedMessageInput();
        }
        this.inputMessage = inputMessage;
    }

    public MessageOutput getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(MessageOutput outputMessage) {
        if (outputMessage == null)
        {
            outputMessage = new ConsoleMessageOutput();
        }
        this.outputMessage = outputMessage;
    }

    public void processMessage() {
        String message = inputMessage.getMessage();
        outputMessage.sendMessage(message);
    }
}
