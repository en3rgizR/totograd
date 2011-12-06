package totograd;

public class Mairie extends ServicesPubliques{

	private final static int cout_mairie = 150;
	private final static int longueur_mairie = 2;
	private final static int largeur_mairie = 2;
	private final static int attractivite_mairie = 10;

	Mairie(Case c) 
	{
		super(cout_mairie, longueur_mairie, largeur_mairie, attractivite_mairie, c);
	}
	
}
