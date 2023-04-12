/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
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
public class CartTest {

    public CartTest() {
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
     * Test of calculateBill method, of class Cart.
     */
    @Test
    public void testCalculateTotal() {
        // 3 Blue flowers = 150 * 3 = 450
        System.out.println("calculateBill");
        ArrayList<Flower> flowerForTest = new ArrayList<Flower>();
        Flower orderForTest = new Flower(3, "Blue flower", 150);
        flowerForTest.add(orderForTest);

        Cart instance = new Cart(flowerForTest);
        double expResult = 450;
        double result = instance.calculateTotal();
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateTax method, of class Cart.
     */
    @Test
    public void testCalculateTax() {
        System.out.println("calculateTax");
        Cart instance = new Cart(300.0);
        double expResult = 345.0;
        double result = instance.calculateTax();
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
    }

}
