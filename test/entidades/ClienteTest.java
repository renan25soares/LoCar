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
public class ClienteTest {
    private Cliente cliente;
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cliente = new Cliente();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Cliente.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Cliente instance = new Cliente();
        String expResult = "ID";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Cliente.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "ID";
        Cliente instance = new Cliente();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = new Cliente();
        String expResult = "nome";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "nome";
        Cliente instance = new Cliente();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class Cliente.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Cliente instance = new Cliente();
        String expResult = "rg";
        String result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRg method, of class Cliente.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        String rg = "rg";
        Cliente instance = new Cliente();
        instance.setRg(rg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Cliente.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente instance = new Cliente();
        String expResult = "cpf";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Cliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "cpf";
        Cliente instance = new Cliente();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarteiraMotorista method, of class Cliente.
     */
    @Test
    public void testGetCarteiraMotorista() {
        System.out.println("getCarteiraMotorista");
        Cliente instance = new Cliente();
        String expResult = "carteiraMotorista";
        String result = instance.getCarteiraMotorista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarteiraMotorista method, of class Cliente.
     */
    @Test
    public void testSetCarteiraMotorista() {
        System.out.println("setCarteiraMotorista");
        String carteiraMotorista = "carteiraMotorista";
        Cliente instance = new Cliente();
        instance.setCarteiraMotorista(carteiraMotorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
