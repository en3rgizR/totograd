package totograd;

import java.awt.*;

import javax.swing.*;

public class AiredeJeu extends JPanel
{
	private Case quadrillage[][];
	private int largeur;
	private int longueur;
	private GridLayout grille;
	
	public AiredeJeu(int largeur,int longueur)
	{
		this.largeur=largeur;
		this.longueur= longueur;
		this.quadrillage = new Case[largeur][longueur];
		grille = new GridLayout(longueur, largeur);
		this.setLayout(grille);
		
	}
	
	public void Initialize(int dimx, int dimy)
	{
		int i, j;
		for(i=0; i < largeur; i++)
		{
			for(j=0; j < longueur; j++)
			{
				quadrillage[i][j] = new Case(Color.GREEN, i, j, dimx, dimy );
				this.add(quadrillage[i][j]);
			}
		}
	}

}
