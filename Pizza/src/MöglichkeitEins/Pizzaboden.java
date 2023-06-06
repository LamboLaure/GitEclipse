package MöglichkeitEins;

import java.util.ArrayList;

public abstract class Pizzaboden {

	protected ArrayList<PizzaZutaten> Zutaten = new ArrayList<PizzaZutaten>();
	protected double Preis;
	protected String Beschreibung; 
	
	
	public double getGesPreis() {
		double ges = 0; 
		for(PizzaZutaten z: Zutaten) {
			ges = ges + z.getPreis();
		}
		ges = ges + this.getBodenPreis(); 
		return ges; 
	}
	
	public String getBeschreibung(){
		String a = getBodenBeschreibung(); 
		for(PizzaZutaten z: Zutaten) {
			a = a  + " mit " + z.getBeschreibung(); 
		}
		
		return a; 
	}
	
	public void add(PizzaZutaten p) {
		Zutaten.add(p);
	}
	
	
	protected abstract double getBodenPreis(); 
	protected abstract String getBodenBeschreibung(); 

}
