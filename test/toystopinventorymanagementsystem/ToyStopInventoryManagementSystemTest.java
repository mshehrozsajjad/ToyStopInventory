/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toystopinventorymanagementsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MuhammadShahroz
 */
public class ToyStopInventoryManagementSystemTest {
    
    public ToyStopInventoryManagementSystemTest() {
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
     * Test of init method, of class ToyStopInventoryManagementSystem.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ToyStopInventoryManagementSystem instance = new ToyStopInventoryManagementSystem();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class ToyStopInventoryManagementSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ToyStopInventoryManagementSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
