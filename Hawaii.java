package Weekopdracht003;

//attractie 5
public class Hawaii extends Attractie{
	
	Hawaii(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		System.out.println("de attractie " + naam + " draait");
	}
}