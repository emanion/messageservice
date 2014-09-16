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
public class MessageServiceTestDrive
{
    public static void main(String[] args)
    {
        
        // FIRST....  run with input of hard coded message.....
        // FIRST....  run with input of hard coded message.....
        // FIRST....  run with input of hard coded message.....
        
        //Get input
        MessageInput messageOne = new HardCodedMessageInput();
        //Get output
        MessageOutput deliveryOne = new ConsoleMessageOutput();
        //plug both into driver
        MessageService messageServiceOne = 
                                 new MessageService(messageOne, deliveryOne);
        // run operation on driver
        messageServiceOne.processMessage();

        
        // SECOND....  run with input of driver coded message.....
        // SECOND....  run with input of driver coded message.....
        // SECOND....  run with input of driver coded message.....
        
        //Get input
        MessageInput messageTwo = new DriverMessageInput("the driver says HEY!!");
        //already have output message from first test case....
        //OutputMessage deliveryOne = new MessageConsole();
        //plug both into driver
        MessageService messageServiceTwo = 
                new MessageService(messageTwo, deliveryOne);
        // run operation on driver
        messageServiceTwo.processMessage();
        
        
        

        
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        
        
        //The setMessaege method is not in the MessageInput Interface!!!!!!
        
        //Get input
        MessageInput messageThree = new DriverMessageInput("not much to say");
        //messageThree.setMessage("hello - this doesnt work!!!")
        //Get output
        MessageOutput deliveryThree = new SwingMessageOutput();
        //plug both into driver
        MessageService messageServiceThree =  
                                 new MessageService(messageThree, deliveryThree);
        // run operation on driver
        messageServiceThree.processMessage();

        
        
        
        

        
        // FOURTH....  Use JOptionPane for output.....
        // FOURTH....  Use JOptionPane for output.....
        // FOURTH....  Use JOptionPane for output.....
        
        
        //Get input
        MessageInput messageFour = new HardCodedMessageInput();
        //Get output
        MessageOutput deliveryFour = new SwingMessageOutput();
        //plug both into driver
        MessageService messageServiceFour =  
                                 new MessageService(messageFour, deliveryFour);
        // run operation on driver
        messageServiceFour.processMessage();

        

    }
}
