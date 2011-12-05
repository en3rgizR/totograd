package totograd;

import java.awt.*;

import javax.swing.*;

public class AiredeJeu extends JPanel
{
	private Case quadrillage[][];
	private GridLayout grille;
	private int largeur;
	private int longueur;
	
	public AiredeJeu(int largeur,int longueur)
	{
		this.largeur=largeur;
		this.longueur= longueur;
		this.quadrillage = new Case[largeur][longueur];
		grille = new GridLayout(longueur, largeur);
		this.setLayout(grille);
		Initialize();
		
	}
	
	public void Initialize()
	{
		int i, j;
		for(i=0; i < largeur; i++)
		{
			for(j=0; j < longueur; j++)
			{
				quadrillage[j][i] = new Case(Color.GREEN, j, i);
				this.add(quadrillage[j][i]);
			}
		}
		
		// On va generer des cases occupes aleatoires (5% au plus des cases totale d'une partie)
		int nbre_random = (int)(Math.random()*((longueur*longueur) * 5/100));
		int randomx, randomy;
		for(i=0; i < nbre_random; i++)
		{
			randomx = (int) (Math.random()*longueur);
			randomy = (int) (Math.random()*longueur);
			quadrillage[randomx][randomy].setBackground(Color.GRAY);
			quadrillage[randomx][randomy].setOccupe(true);
		}
	}

}
