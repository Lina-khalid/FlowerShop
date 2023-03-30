/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author st
 */
public class AdminTest {

    public AdminTest() {
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
     * Test of setFlowers method, of class Admin.
     */
    @Test
    public void testSetFlowers() {
        System.out.println("addFlower");
        Flower f = new Flower("Flower Bag", 2, 200);
        boolean result = Admin.addFlower(f);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addFlower method, of class Admin.
     */
    @Test
    public void testAddFlower() {
        System.out.println("addFlower");
        Flower f = new Flower("Blue Flower", 1, 150);
        // boolean expResult = true;
        boolean result = Admin.addFlower(f);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
