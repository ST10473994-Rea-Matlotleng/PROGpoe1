/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpoe1;

/**
 *
 * @author Jeanette
 */
import javax.swing.JOptionPane;

public class PROGpoe1 {
    public static String savedPhone = "";
    public static String savedUsername = "";
    public static String savedPassword = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // registration
        boolean registered = registerUser();
        if (!registered) {
            return;
        }
        //Login
        loginUser();
    }
    
    public static boolean registerUser() {
        //username
        String username = JOptionPane.showInputDialog("Register\nEnter a username (must contain an underscore and be 5 characters or less):");
        if (username == null || !username.contains("_") || username.length() > 5){
            JOptionPane.showMessageDialog(null, "Invalid username,try again. Please ensure it contains an underscore and is no longer than 5 characters.");
            return false;
        }
        savedUsername = username;
        JOptionPane.showMessageDialog(null, "Username has been captured.");
        
        //password
        String password = JOptionPane.showInputDialog("Enter a password (minimum 8 characters, 1 number, 1 special character):");
        if (password == null || !isValidPassword(password)) {
            JOptionPane.showMessageDialog(null, "Invalid password. It must be at least 8 characters long, contain at least 1 number, and one special character");
            return false;
        }
        savedPassword = password;
        JOptionPane.showMessageDialog(null, "Password has been captured.");
        
// phone number
String phone = JOptionPane.showInputDialog("Enter your South African cellphone number please:");
boolean validPhone = false;

if (phone != null) {
    if (phone.startsWith("+27") && phone.length() == 12) {
        validPhone = true;
    } else if (phone.startsWith("0") && phone.length() == 10) {
        validPhone = true;
    }
}
if (!validPhone) {
    JOptionPane.showMessageDialog(null, "Invalid phone number. It must with +27 or 0.");
return false;
}

savedPhone = phone;
JOptionPane.showMessageDialog(null, "Acount successfully created!\nUsername: " + savedUsername + "\nPhone: " + savedPhone);
return true;
    }
     public static void loginUser() {
         String loginUsername = JOptionPane.showInputDialog("Login\nEnter your username:");
         String loginPassword = JOptionPane.showInputDialog("Enter your password:");
         
         if (loginUsername != null && loginPassword != null &&
                 loginUsername.equals(savedUsername) && loginPassword.equals(savedPassword)) {
         JOptionPane.showMessageDialog(null, "Welcome " + loginUsername + ", it is great to see you once again!");
         } else {
             JOptionPane.showMessageDialog(null, "Username or password incorrect, try again.");
         }
     }
     
public static boolean isValidPassword(String password) {
    boolean hasNumber = false;
    boolean hasSpecialChar = false;
    
    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        
        if (Character.isDigit(c)) {
            hasNumber = true;
        } else if (!Character.isLetterOrDigit(c)) {
            hasSpecialChar = true;
        }
    }
    
    return hasNumber && hasSpecialChar;
}
}