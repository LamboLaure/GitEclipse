package MöglichkeitEins;

public class Pizzeria {

	public Pizzaboden getDiavolo() {
		Pizzaboden p = new Weizenboden();
		p.add(new Käse());
		p.add(new Tomaten());
		System.out.println("Der Gesamtpreis der Pizza beträgt: " + p.getGesPreis() + " EURO"); 
		System.out.println("Die Zutaten der Pizza: " + p.getBeschreibung() + " EURO");
		return p; 
	}
	
}
