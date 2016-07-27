/* 
 * CS1632-deliverable6
 * @ Lun Xi 
 */

package sieve;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SieveTest {
    
    public SieveTest() {
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
     * Test of convertResults method, of class Sieve.
     */
    @Test
    public void testConvertResults1() {
        System.out.println("convertResults1");
        int[] results = new int[]{1,2,3,4,5};
        boolean[] prime = new boolean[]{true, true, true, false, true};
        int[] expResult = {1,2,3,5};
        int[] result = Sieve.convertResults(results, prime);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of convertResults method, of class Sieve.
     */
    @Test
    public void testConvertResults2() {
        System.out.println("convertResults2");
        int[] results = new int[]{1,2,3,4,5,6,7,8,9,10};
        boolean[] prime = new boolean[]{true, true, true, false, true, false, true, false, false, false};
        int[] expResult = {1,2,3,5,7};
        int[] result = Sieve.convertResults(results, prime);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of calculateMax method, of class Sieve.
     */
    @Test
    public void testCalculateMax1() {
        System.out.println("calculateMax");
        String[] args = new String[]{"20"};
        int expResult = 0;
        int result = Sieve.calculateMax(args);
        assertEquals(20, result);
        
    }
    
    
     @Test
    public void testCalculateMax2() {
        System.out.println("calculateMax");
        String[] args = new String[]{"40"};
        int expResult = 0;
        int result = Sieve.calculateMax(args);
        assertEquals(40, result);
        
    }
}
