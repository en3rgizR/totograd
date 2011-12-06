package totograd;

import java.awt.Color;

abstract class ServicesPubliques extends Batiments
{
	private final static Color couleur_habitat = Color.RED;
	float attractivite;
	
	ServicesPubliques(int cout_argent, int longueur, int largeur, float attractivite, Case c) 
	{
		super(cout_argent, couleur_habitat, longueur, largeur, c);
		this.attractivite = attractivite;
	}
	
	public float getAttractivite()
	{
		return attractivite;
	}
	
	public void payZone(Case case_const)
	{
		super.payZone(case_const);
		case_const.getAire().getPartie().MajAttractivite(attractivite, true);
	}
	
	public void eraseZone()
	{
		super.eraseZone();
		case_const.getAire().getPartie().MajAttractivite(attractivite, false);
	}
	
}
