/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author davinci618
 *
 */
public class AutoGumaTest {
	private AutoGuma a;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a=null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		assertEquals("Tigar", a.getMarkaModel());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelManje() {
		a.setMarkaModel("Ti");
	}
	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(20, a.getPrecnik());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(10);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikVise() {
		a.setPrecnik(25);
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		a.setSirina(300);
		assertEquals(300, a.getSirina());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(130);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetSirinaVise() {
		a.setSirina(360);
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(20);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaVise() {
		a.setVisina(100);
	}
	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Tigar, precnik=15, sirina=200, visina=50]", a.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject1() {
		AutoGuma a2=new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(15);
		a2.setSirina(200);
		a2.setVisina(50);
		
		assertEquals(a.equals(a2), true);
	}
	@Test
	public void testEqualsObject0() {
		AutoGuma a2=new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(15);
		a2.setSirina(190);
		a2.setVisina(50);
		
		assertEquals(a.equals(a2), false);
	}
}
