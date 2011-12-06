package totograd;

import java.awt.Color;

abstract class Habitations extends Batiments
{
	private final static Color couleur_habitat = Color.PINK;
	private int loyer;
	private int capacite;

	Habitations(int cout_argent, int loyer, int capacite, int longueur, int largeur, Case c) 
	{
		super(cout_argent, couleur_habitat, longueur, largeur, c);
		this.capacite = capacite;
		this.loyer = loyer;
	}

	public int getCapacite()
	{
		return capacite;
	}

	public int getLoyer()
	{
		return loyer;
	}


	public void gestionCapacite()
	{
		int tmp;
		tmp = capacite + _case.getAire().getPartie().nbhabitants;
		_case.getAire().getPartie().nbhabitants = tmp;
		_case.getAire().getPartie().getFenJeu().habitants.setText(_case.getAire().getPartie().habitant_courant+"/"+tmp);;
	}

	public void gestionLoyer()
	{
		_case.getAire().setLoyerTotale(loyer);
	}

}
