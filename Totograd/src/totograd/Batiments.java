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
	int nbcases_longueur;
	int nbcases_largeur;
	
	Batiments(int cout_argent, Color color_construc, int infl_euclid, int influ_manhattan,int r_argent,int r_biens,int r_personnes
			,int r_genere, int nbcases_longueur, int nbcases_largeur ) 
	{
		super(cout_argent, color_construc);
		this.infl_euclid = infl_euclid;
		this.influ_manhattan = influ_manhattan;
		this.r_argent = r_argent;
		this.r_biens = r_biens;
		this.r_personnes = r_personnes;
		this.r_genere = r_genere;
		this.nbcases_longueur = nbcases_longueur;
		this.nbcases_largeur = nbcases_largeur;
	}
	

}
