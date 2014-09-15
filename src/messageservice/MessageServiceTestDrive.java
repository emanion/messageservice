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
        InputMessage messageOne = new HardCodedMessage();
        //Get output
        OutputMessage deliveryOne = new MessageConsole();
        //plug both into driver
        MessageService messageServiceOne = 
                                 new MessageService(messageOne, deliveryOne);
        // run operation on driver
        messageServiceOne.displayMessage();

        
        // SECOND....  run with input of driver coded message.....
        // SECOND....  run with input of driver coded message.....
        // SECOND....  run with input of driver coded message.....
        
        //Get input
        InputMessage messageTwo = new DriverMessage("the driver says HEY!!");
        //already have output message from first test case....
        //OutputMessage deliveryOne = new MessageConsole();
        //plug both into driver
        MessageService messageServiceTwo = 
                new MessageService(messageTwo, deliveryOne);
        // run operation on driver
        messageServiceTwo.displayMessage();
        
        
        

        
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        // THIRD....  TRY to (Wont work) use input setMessage method.....
        
        
        //Get input
        InputMessage messageThriee = new DriverMessage("not much to say");
        //now set the input message to something else
        //The following line gets an error, becuase the method setMessage NOT in the INTERFACE!!!
        //The following line gets an error, becuase the method setMessage NOT in the INTERFACE!!!
        //The following line gets an error, becuase the method setMessage NOT in the INTERFACE!!!
        //The following line gets an error, becuase the method setMessage NOT in the INTERFACE!!!
        //The following line gets an error, becuase the method setMessage NOT in the INTERFACE!!!
        //--->messageThree.setMessage("Here's the third statement!!!!");

        
        
        
        

        
        // FOURTH....  Use JOptionPane for output.....
        // FOURTH....  Use JOptionPane for output.....
        // FOURTH....  Use JOptionPane for output.....
        
        
        //Get input
        InputMessage messageFour = new HardCodedMessage();
        //Get output
        OutputMessage deliveryFour = new SwingMessage();
        //plug both into driver
        MessageService messageServiceFour =  
                                 new MessageService(messageFour, deliveryFour);
        // run operation on driver
        messageServiceFour.displayMessage();

        

    }
}
