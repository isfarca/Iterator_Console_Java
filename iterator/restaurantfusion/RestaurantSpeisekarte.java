package headfirst.iterator.restaurantfusion;

public class RestaurantSpeisekarte implements Speisekarte {
	static final int MAX_SPEISEN = 6;
	int anzahlVonSpeisen = 0;
	Speise[] speisen;
  
	public RestaurantSpeisekarte() {
		speisen = new Speise[MAX_SPEISEN];
 
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
		if (anzahlVonSpeisen >= MAX_SPEISEN) {
			System.err.println("Leider ist die Speisekarte schon voll!  Kann Speise nicht hinzuf�gen");
		} else {
			speisen[anzahlVonSpeisen] = speise;
			anzahlVonSpeisen = anzahlVonSpeisen + 1;
		}
	}
 
	public Speise[] getSpeisen() {
		return speisen;
	}
  
	public Iterator erstelleIterator() {
		return new RestaurantSpeisekartenIterator(speisen);
	}
 
	// hier weitere Methoden
}
