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
public class upstatusTest {
    
    public upstatusTest() {
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
     * Test of nam method, of class upstatus.
     */
    @Test
    public void testNam() {
        System.out.println("nam");
        String id = "";
        upstatus instance = new upstatus();
        String expResult = "";
        String result = instance.nam(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of up method, of class upstatus.
     */
    @Test
    public void testUp() {
        System.out.println("up");
        String sta = "";
        String id = "";
        upstatus instance = new upstatus();
        instance.up(sta, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
