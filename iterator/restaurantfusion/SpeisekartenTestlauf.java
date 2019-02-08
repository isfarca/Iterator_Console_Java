package headfirst.iterator.restaurantfusion;

import java.util.*;

public class SpeisekartenTestlauf {
	public static void main(String args[]) {
        PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
        RestaurantSpeisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();
 
		Kellnerin kellnerin = new Kellnerin(pfannkuchenhausSpeisekarte, restaurantSpeisekarte);
 
		kellnerin.speisekarteAusgeben();
	}

	public static void printMenu() {
		PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
		RestaurantSpeisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();

		ArrayList fr�hst�cksElemente = pfannkuchenhausSpeisekarte.getSpeisen();
 
		for (int i = 0; i < fr�hst�cksElemente.size(); i++) {
			Speise speise = (Speise)fr�hst�cksElemente.get(i);
			System.out.print(speise.getName());
			System.out.println("\t\t" + speise.getPreis());
			System.out.println("\t" + speise.getBeschreibung());
		}

		Speise[] mittagessenElemente = restaurantSpeisekarte.getSpeisen();
 
		for (int i = 0; i < mittagessenElemente.length; i++) {
			Speise speisen = mittagessenElemente[i];
			System.out.print(speisen.getName());
			System.out.println("\t\t" + speisen.getPreis());
			System.out.println("\t" + speisen.getBeschreibung());
		}
	}
}
