/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primeiraaulateste.Matematica;

public class MatematicaTest {

    public MatematicaTest() {
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

    @Test
    public void somarDoisNuerosPositivosTest() {
        Matematica m = new Matematica();
        double resultado = m.somar(10.0, 20.0);

        assertEquals(30.0, resultado, 0.001);
    }
}
