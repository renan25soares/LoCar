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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author joser
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entidades.LocacaoTest.class, entidades.CarroTest.class, entidades.ClienteTest.class})
public class EntidadesSuite {
    private Carro carro; 
    private Cliente cliente;
    private Locacao locacao;
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        carro = new Carro();
        cliente = new Cliente();
        locacao = new Locacao();
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
