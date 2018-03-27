/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.ServantRetentionPolicyValue;

import gume.AutoGuma;

/**
 * @author davinci618
 *
 */
public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja a;
	AutoGuma g1;
	AutoGuma g2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a=new VulkanizerskaRadnja();
		g1=new AutoGuma();
		g1.setMarkaModel("Tigar");
		g1.setPrecnik(20);
		g1.setSirina(200);
		g1.setVisina(50);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a=null;
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumu() {
		a.dodajGumu(g1);
		assertEquals(g1, a.gume.getFirst());
	}
	@Test (expected=java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		a.dodajGumu(null);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		a.dodajGumu(g1);
		a.dodajGumu(g1);
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		a.dodajGumu(g1);
		assertEquals(g1, a.pronadjiGumu("Tigar").get(0));
	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, a.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumuNema() {
		assertEquals(null, a.pronadjiGumu("Test"));
	}
	@Test
	public void testPronadjiGumuRazliciteDimenzije() {
		a.gume.add(g1);
		
		g2=new AutoGuma();
		g2.setMarkaModel("Tigar");
		g2.setPrecnik(20);
		g2.setSirina(300);
		g2.setVisina(45);
		a.gume.add(g2);
		
		assertEquals(g1, a.pronadjiGumu("Tigar").get(0));
		assertEquals(g2, a.pronadjiGumu("Tigar").get(1));
	}
}
