package practica;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ud.prog3.pr01.ListaDeReproduccion;

public class ListaDeReproduccionTest {
	
	
	private ListaDeReproduccion lr1;
	private ListaDeReproduccion lr2;
	private final File FIC_TEST1 =new File ("test/res/No del grupo.mp4");
	private final File FIC_TEST2 =new File ("test/res/Si del grupo.mp4");
	
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGet_Exc1() {
		
		lr1.getFic(0);
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGet_Exc2() {
		
		lr1.getFic(-1);
		
	}

	
	@Test
	public void testGet() {
		
		assertEquals(FIC_TEST1 ,lr2.getFic(0));
		
	}
	

	

    @Test(expected = IndexOutOfBoundsException.class)
     public void testIntercambio() {
    	     lr2.intercambia(0, 1);
    	     assertEquals(lr2.getFic(0), FIC_TEST2);
	
             }
    
    
    
    @Test
	public void testAñadir() {
		
		assertEquals(lr2.getFic(lr2.getSize()-1) ,FIC_TEST2);
		
	}

    @Test
   	public void testBorrar() {
   		lr2.remove(1);
   		assertEquals(lr2.getFic(0) ,FIC_TEST1);
   		
   	}

    @Test
   	public void testTamaño() {
   		
   		assertEquals(lr2.size(),2);
   		
   	}
	
    
    @Test
   	public void addCarpeta() {
    	
    	String carpetaTest = "test/res/";
    	String filtroTest ="*Pentatonix*.mp4";
    	ListaDeReproduccion lr =new ListaDeReproduccion();
    	lr.add(carpetaTest, filtroTest);
    	fail("Metodo sin acabar");
   		
   	}
    
    
    @Test
   	public void testirARandom() {
    	boolean respuesta =lr1.irARandom();
    	assertTrue(respuesta);
   		
   	}
    
	@Before
	public void setUp() throws Exception {
		lr1 =new ListaDeReproduccion();
		lr2 =new ListaDeReproduccion();
		lr2.add(FIC_TEST1);
		lr2.add(FIC_TEST2);
		
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		lr2.clear();
	}

}
