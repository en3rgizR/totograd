package totograd;

public class HLM extends Habitations
{

	private final static int cout_hlm = 450;
	private final static int revenu_hlm = 50;
	private final static int capacite_hlm = 40;
	private final static int longueur_hlm = 2;
	private final static int largeur_hlm = 2;
	
	HLM(Case c) 
	{
		super(cout_hlm, revenu_hlm, capacite_hlm, longueur_hlm, largeur_hlm, c);
		gestionCapacite();
	}
	

}
