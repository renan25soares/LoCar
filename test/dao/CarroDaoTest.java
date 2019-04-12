/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Carro;
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
public class CarroDaoTest {
    
    public CarroDaoTest() {
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
     * Test of Inserir method, of class CarroDao.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("Inserir");
        Carro carro = null;
        CarroDao instance = new CarroDao();
        instance.Inserir(carro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarTodos method, of class CarroDao.
     */
    @Test
    public void testListarTodos() throws Exception {
        System.out.println("ListarTodos");
        CarroDao instance = new CarroDao();
        List<Carro> expResult = null;
        List<Carro> result = instance.ListarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarPorId method, of class CarroDao.
     */
    @Test
    public void testBuscarPorId() throws Exception {
        System.out.println("BuscarPorId");
        String codigo = "";
        CarroDao instance = new CarroDao();
        Carro expResult = null;
        Carro result = instance.BuscarPorId(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deletar method, of class CarroDao.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
        int codigo = 0;
        CarroDao instance = new CarroDao();
        boolean expResult = false;
        boolean result = instance.Deletar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class CarroDao.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        Carro c = null;
        CarroDao instance = new CarroDao();
        instance.Alterar(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
