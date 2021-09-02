/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hasnayen
 */
public class userTest {
    
    public userTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of signIn method, of class user.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String userID = "";
        String pass = "";
        user instance = new user();
        instance.signIn(userID, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signup method, of class user.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        String UserId = "";
        String fName = "";
        String lName = "";
        String email = "";
        String address = "";
        String pass = "";
        String conpass = "";
        user instance = new user();
        instance.signup(UserId, fName, lName, email, address, pass, conpass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
