package totograd;

import java.awt.Color;


abstract class Batiments extends Construction
{
	int infl_euclid;
	int influ_manhattan;
	int r_argent;
	int r_biens;
	int r_personnes;
	Case _case;
	Case[] zone_case;

	
	
	// Constructeur specialise dans les habitations (rappel : r_argent designe la taxe d'habitation)
	Batiments(int cout_argent, Color color_construc, int longueur, int largeur, Case c)
	{
		super(cout_argent, color_construc, longueur, largeur, c);
		this._case=c;
	}
	

	

}

