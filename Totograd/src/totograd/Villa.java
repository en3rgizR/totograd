package totograd;

public class Villa extends Habitations
{

	private final static int cout_immeuble = 250;
	private final static int revenu_immeuble = 25;
	private final static int capacite_immeuble = 30;
	private final static int longueur_immeuble = 3;
	private final static int largeur_immeuble = 1;
	
	Villa(Case c) 
	{
		super(cout_immeuble, revenu_immeuble, capacite_immeuble, longueur_immeuble, largeur_immeuble, c);
		if(is_construit)
		{
			c.getAire().getPartie().MajCapacite(capacite_immeuble, true);
			c.getAire().getPartie().setLoyerTotal(revenu_immeuble, true);
		}
	}	
}
