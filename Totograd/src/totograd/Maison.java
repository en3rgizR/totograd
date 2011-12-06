package totograd;

public class Maison extends Habitations
{
	private final static int cout_maison = 150;
	private final static int revenu_maison = 12;
	private final static int capacite_maison = 15;
	private final static int longueur_maison = 1;
	private final static int largeur_maison = 1;

	Maison(Case c) 
	{
		super(cout_maison, revenu_maison, capacite_maison, longueur_maison, largeur_maison, c);
		gestionCapacite();
	}
}
