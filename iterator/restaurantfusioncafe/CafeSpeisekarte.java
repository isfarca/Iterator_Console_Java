package headfirst.iterator.restaurantfusioncafe;

import java.util.*;

public class CafeSpeisekarte implements Speisekarte {
	Hashtable speisen = new Hashtable();
  
	public CafeSpeisekarte() {
		speiseHinzuf�gen("Vegetarischer Burger mit Pommes",
			"Vegetarischer Burger aus Vollkornbr�tchen, Salat, Tomaten mit Pommes",
			true, 3.99);
		speiseHinzuf�gen("Tagessuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat",
			false, 3.69);
		speiseHinzuf�gen("Burrito",
			"Gro�er Burrito mit Bohnen, Mais und So�e",
			true, 4.29);
	}
 
	public void speiseHinzuf�gen(String name, String beschreibung, 
	                     boolean vegetarisch, double preis) 
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		speisen.put(speise.getName(), speise);
	}
 
	public Hashtable getSpeisen() {
		return speisen;
	}
  
	public Iterator createIterator() {
		return speisen.values().iterator();
	}
}
