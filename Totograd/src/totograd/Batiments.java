package totograd;

import java.awt.Color;


abstract class Batiments extends Construction
{
	int infl_euclid;
	int influ_manhattan;
	int r_argent;
	int r_biens;
	int r_personnes;
	int r_genere;
	Case _case;
	Case[] zone_case;
	
	// Constructeur specialise dans les habitations (rappel : r_argent designe la taxe d'habitation)
	Batiments(int cout_argent, Color color_construc, int r_argent, int r_personnes, int longueur, int largeur, Case c)
	{
		super(cout_argent, color_construc, longueur, largeur, c);
		this.r_argent = r_argent;
		this.r_personnes = r_personnes;
		this._case=c;
	}
	
	public void gestionAffichage()
	{
		int tmp;
		tmp = r_personnes+ _case.getAire().getPartie().nbhabitants;
		_case.getAire().getPartie().nbhabitants = tmp;
		_case.getAire().getPartie().getFenJeu().habitants.setText(_case.getAire().getPartie().habitant_courant+"/"+tmp);

	}

}

