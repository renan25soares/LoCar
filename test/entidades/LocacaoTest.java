/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joser
 */
public class LocacaoTest {
    private Locacao locacao;
    public LocacaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        locacao = new Locacao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Locacao.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Locacao instance = new Locacao();
        String expResult = "ID";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Locacao.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String id = "ID";
        Locacao instance = new Locacao();
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoCarro method, of class Locacao.
     */
    @Test
    public void testGetCodigoCarro() {
        System.out.println("getCodigoCarro");
        Locacao instance = new Locacao();
        String expResult = "codigoCarro";
        String result = instance.getCodigoCarro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCarro method, of class Locacao.
     */
    @Test
    public void testSetCodigoCarro() {
        System.out.println("setCodigoCarro");
        String codigoCarro = "codigoCarro";
        Locacao instance = new Locacao();
        instance.setCodigoCarro(codigoCarro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoCliente method, of class Locacao.
     */
    @Test
    public void testGetCodigoCliente() {
        System.out.println("getCodigoCliente");
        Locacao instance = new Locacao();
        String expResult = "codigoCliente";
        String result = instance.getCodigoCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCliente method, of class Locacao.
     */
    @Test
    public void testSetCodigoCliente() {
        System.out.println("setCodigoCliente");
        String codigoCliente = "codigoCliente";
        Locacao instance = new Locacao();
        instance.setCodigoCliente(codigoCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataRetorno method, of class Locacao.
     */
    @Test
    public void testGetDataRetorno() {
        System.out.println("getDataRetorno");
        Locacao instance = new Locacao();
        String expResult = "dataRetorno";
        String result = instance.getDataRetorno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataRetorno method, of class Locacao.
     */
    @Test
    public void testSetDataRetorno() {
        System.out.println("setDataRetorno");
        String dataRetorno = "dataRetorno";
        Locacao instance = new Locacao();
        instance.setDataRetorno(dataRetorno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}