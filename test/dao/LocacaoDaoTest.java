/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Locacao;
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
public class LocacaoDaoTest {
    
    public LocacaoDaoTest() {
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
     * Test of Inserir method, of class LocacaoDao.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("Inserir");
        Locacao registro = null;
        LocacaoDao instance = new LocacaoDao();
        instance.Inserir(registro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alterar method, of class LocacaoDao.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        Locacao c = null;
        LocacaoDao instance = new LocacaoDao();
        instance.Alterar(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarTodos method, of class LocacaoDao.
     */
    @Test
    public void testListarTodos() throws Exception {
        System.out.println("ListarTodos");
        LocacaoDao instance = new LocacaoDao();
        List<Locacao> expResult = null;
        List<Locacao> result = instance.ListarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deletar method, of class LocacaoDao.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
        int codigo = 0;
        LocacaoDao instance = new LocacaoDao();
        boolean expResult = false;
        boolean result = instance.Deletar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
