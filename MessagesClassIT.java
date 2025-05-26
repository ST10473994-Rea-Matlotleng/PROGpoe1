/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package progassignment5121;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jeanette
 */
public class MessagesClassIT {
    
    public MessagesClassIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of showWelcomeMessage method, of class MessagesClass.
     */
    @Test
    public void testShowWelcomeMessage() {
        System.out.println("showWelcomeMessage");
        String username = "";
        MessagesClass.showWelcomeMessage(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class MessagesClass.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        String username = "";
        MessagesClass.showMenu(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageID method, of class MessagesClass.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        String id = "";
        boolean expResult = false;
        boolean result = MessagesClass.checkMessageID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class MessagesClass.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String number = "";
        boolean expResult = false;
        boolean result = MessagesClass.checkRecipientCell(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class MessagesClass.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String message = "";
        String expResult = "";
        String result = MessagesClass.createMessageHash(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
