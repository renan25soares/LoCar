/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Cliente;
import java.util.List;
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
public class ClienteDaoTest {
    
    public ClienteDaoTest() {
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
     * Test of Inserir method, of class ClienteDao.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("Inserir");
        Cliente registro = null;
        ClienteDao instance = new ClienteDao();
        instance.Inserir(registro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deletar method, of class ClienteDao.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
        int codigoCliente = 0;
        ClienteDao instance = new ClienteDao();
        boolean expResult = false;
        boolean result = instance.Deletar(codigoCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarTodos method, of class ClienteDao.
     */
    @Test
    public void testListarTodos() throws Exception {
        System.out.println("ListarTodos");
        ClienteDao instance = new ClienteDao();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.ListarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class ClienteDao.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        Cliente c = null;
        ClienteDao instance = new ClienteDao();
        instance.Alterar(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
