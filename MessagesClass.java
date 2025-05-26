/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progassignment5121;

/**
 *
 * @author Jeanette
 */

import progpoe1.PROGpoe1;
import javax.swing.JOptionPane;
public class MessagesClass {
    public static void showWelcomeMessage(String username) {
        JOptionPane.showMessageDialog(null, "Welcome to QuickChat.");
        showMenu(username);
    }
    public static void showMenu(String username) {
        int totalMessageSent = 0; 
        while (true) {
            String menuChoice = JOptionPane.showInputDialog(
            """
            QuickChat Menu:
            1) Send Menu
            2) Coming Soon
            3) Quit
            
            Enter your choice (1-3):""");
            
            if (menuChoice == null) {
                break;
            }
            
            switch (menuChoice) {
                case "1" -> {
                    String numStr = JOptionPane.showInputDialog("How many messages do you want to send");
                    if (numStr == null) break;
                    
                    try { 
                        int messageCount = Integer.parseInt(numStr);
                        int sessionSentCount = 0;
                        
                        for (int i = 1; i <= messageCount; i++) {
                            String messageID = JOptionPane.showInputDialog("Enter message ID (max 10 characters):");
                            if (!checkMessageID(messageID)) {
                                JOptionPane.showMessageDialog(null, "Invalid MEssage ID. Must be 10 characters or less.");
                                i--;
                                continue;
                            }
                            
                            String recipient = JOptionPane.showInputDialog("Enter recipient phone number:");
                            if (!checkRecipientCell(recipient)) {
                                JOptionPane.showMessageDialog(null, "Invalid recipient number. Must start with +27 and be 13 characters.");
                                i--;
                                continue;
                            }
                             String message = JOptionPane.showInputDialog("Enter message " + i + ":");
                             
                             if (message == null || recipient == null) {
                                 JOptionPane.showMessageDialog(null, "Message cancelled.");
                                 break;
                            }
                        if (message.length() > 250) {
                            JOptionPane.showMessageDialog(null,
                                    "Message too long! Enter a message of less than 250 characters.");
                            i--;
                            continue;
                        }
                        String[] options = {"Send Message", "Disregard Message", "Store Message to Send Later"};
                        int choice = JOptionPane.showOptionDialog(null,
                                "What would you like to do with this message?\n" + message,
                                "Message Options",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                options[0]);
                                
                                switch (choice) {
                                    case 0 -> {
                                        String hash = createMessageHash(message);
                                        JOptionPane.showMessageDialog(null, "Message " + 1 + " sent: " + message);
                                        JOptionPane.showMessageDialog(null,
                                                "Receipt:\nRecipient: " + recipient +
                                                "\nSender: " + PROGpoe1.savedPhone + "\nMessage Hash: " + hash);
                                        totalMessageSent++;
                                        sessionSentCount++;
                                    }
                                    case 1 -> JOptionPane.showMessageDialog(null, "Message " + 1 + " was disregarded.");
                                    case 2 -> JOptionPane.showMessageDialog(null, "Message " + 1 + " has been saved for later.");
                                    default -> JOptionPane.showMessageDialog(null, "No action selected, message disregarded.");
                                }
                        }
                        JOptionPane.showMessageDialog(null, 
                                "You successfully sent " + sessionSentCount + " message(s) in this session.\n" +
                                " Total message sent so far: " + totalMessageSent);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid Number. Please enter a valid numeric value.");
                    }
                }
                case "2" -> JOptionPane.showMessageDialog(null, "Feature coming soon!");
                case "3" -> { JOptionPane.showMessageDialog(null, "Thank you for using Quickchat.\nTotal messages sent during session: " + totalMessageSent);
                System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
public static boolean checkMessageID(String id) {
return id != null && id.length() <= 10;
}
public static boolean checkRecipientCell(String number) {
    return number != null && number.startsWith("+27") && number.length() <= 13 && number.substring(1).matches("\\d+");
}
public static String createMessageHash(String message) {
    return Integer.toHexString(message.hashCode());
}
}
