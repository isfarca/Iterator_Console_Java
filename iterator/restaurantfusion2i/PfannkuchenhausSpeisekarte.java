package headfirst.iterator.restaurantfusion2i;

import java.util.ArrayList;
import java.util.Iterator;

public class PfannkuchenhausSpeisekarte implements Speisekarte {
	ArrayList speisen;
 
	public PfannkuchenhausSpeisekarte() {
		speisen = new ArrayList();
    
		speiseHinzuf�gen("Pfannkuchen-Fr�hst�ck Spezial", 
				"Pfannkuchen mit R�hrei und Toast", 
				true,
				2.99);
	 
		speiseHinzuf�gen("Pfannkuchen-Fr�st�ck Normal", 
     			"Pfannkuchen mit Spiegelei und Wurst", 
				false,
				2.99);
	 
	    speiseHinzuf�gen("Blaubeer-Pfannkuchen",
				"Pfannkuchen mit frischen Blaubeeren",
				true,
				3.49);  
	 
		speiseHinzuf�gen("Waffeln",
				"Waffeln mit Blaubeeren oder Erdbeeren",
				true,
				3.59);
	}

	public void speiseHinzuf�gen(String name, String beschreibung,
	                    boolean vegetarisch, double preis)
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		speisen.add(speise);
	}
 
	public ArrayList getSpeisen() {
		return speisen;
	}
  
	public Iterator createIterator() {
		return speisen.iterator();
	}
  
	// andere Speisekarten-Methoden kommen hier hin
}
