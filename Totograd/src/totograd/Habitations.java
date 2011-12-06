package totograd;

import java.awt.Color;

abstract class Habitations extends Batiments
{
	private final static Color couleur_habitat = Color.PINK;

	Habitations(int cout_argent, int r_argent, int r_personnes, int longueur, int largeur, Case c) 
	{
		super(cout_argent, couleur_habitat, r_argent, r_personnes, longueur, largeur, c);
	}
	
	public int getCapacite()
	{
		return r_personnes;
	}


}
