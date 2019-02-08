package headfirst.iterator.restaurantfusion2i;

import java.util.Iterator;

public class RestaurantSpeisekarte implements Speisekarte {
	static final int MAX_ELEMENTE = 6;
	int anzahlElemente = 0;
	Speise[] speisen;
  
	public RestaurantSpeisekarte() {
		speisen = new Speise[MAX_ELEMENTE];
 
		speiseHinzuf�gen("Vegetarisches Sandwich",
				"(Falscher) Schinken mit Salat & Tomate auf Vollkornbrot", true, 2.99);
		speiseHinzuf�gen("Schinken-Sandwich",
				"Schinken mit Salat & Tomate auf Vollkornbrot", false, 2.99);
		speiseHinzuf�gen("Tagessuppe",
				"Tagessuppe, mit Kartoffelsalat als Beilage", false, 3.29);
		speiseHinzuf�gen("Hotdog",
				"Ein Hot-Dog mit Sauerkraut, Gew�rzen, Zwiebeln und K�se",
				false, 3.05);
		speiseHinzuf�gen("Ged�nstete Gem�se auf braunem Reis",
				"Verschiedene ged�nstete Gem�se auf braunem Reis", true, 3.99);
		speiseHinzuf�gen("Pasta",
				"Spaghetti mit Marinara-So�e und einer Scheibe Ciabatta-Brot",
				true, 3.89);
	}
  
	public void speiseHinzuf�gen(String name, String beschreibung, 
	                     boolean vegetarisch, double preis) 
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		if (anzahlElemente >= MAX_ELEMENTE) {
			System.err.println("Leider ist die Speisekarte voll! Kann Speise nicht hinzuf�gen");
		} else {
			speisen[anzahlElemente] = speise;
			anzahlElemente = anzahlElemente + 1;
		}
	}
 
	public Speise[] getSpeisen() {
		return speisen;
	}
  
	public Iterator createIterator() {
		return new RestaurantSpeisekartenIterator(speisen);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// andere Speisekarten-Methoden kommen hier hin
}
