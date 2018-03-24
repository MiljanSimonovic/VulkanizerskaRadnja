package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * @author MiljanSimonovic
 * @version 1.0
 * Klasa VulkanizerskaRadnja sadrzi listu guma i metode koje ubacuju i pronalaze gumu
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * atribut koji predstavlja listu guma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * metoda koja dodaje novu gumu na pocetak liste guma
	 * @param a
	 * @throws java.lang.NullPointerException ako je guma null
	 * @throws java.lang.RuntimeException ako guma vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * metoda koja pronalazi gumu na osnovu unetog modela
	 * @param markaModel
	 * @return novaLista/null ako je unet model null
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}