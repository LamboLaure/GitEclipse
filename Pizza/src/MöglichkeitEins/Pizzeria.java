package M�glichkeitEins;

public class Pizzeria {

	public Pizzaboden getDiavolo() {
		Pizzaboden p = new Weizenboden();
		p.add(new K�se());
		p.add(new Tomaten());
		System.out.println("Der Gesamtpreis der Pizza betr�gt: " + p.getGesPreis() + " EURO"); 
		System.out.println("Die Zutaten der Pizza: " + p.getBeschreibung() + " EURO");
		return p; 
	}
	
}
