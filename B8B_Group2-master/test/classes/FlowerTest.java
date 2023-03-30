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
 * @author Hp
 */
public class FlowerTest {
    
    public FlowerTest() {
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
     * Test of getFlowerType method, of class Flower.
     */
    @Test
    public void testGetFlowerType() {
        System.out.println("getFlowerType");
        Flower instance = new Flower ("Blue flower", 3, 150);
        String expResult = "Blue flower";
        String result = instance.getFlowerType();
         assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}




