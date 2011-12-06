package totograd;

public class Villa extends Habitations
{

	private final static int cout_immeuble = 250;
	private final static int revenu_immeuble = 25;
	private final static int capacite_immeuble = 30;
	private final static int longueur_immeuble = 3;
	private final static int largeur_immeuble = 3;
	
	Villa(Case c) 
	{
		super(cout_immeuble, revenu_immeuble, capacite_immeuble, longueur_immeuble, largeur_immeuble, c);
		if(is_construit)
		{
			gestionCapacite();
			gestionLoyer();
		}
	}
}
