package totograd;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Partie
{

	public int argent; 
	public int biens;
	public int nbhabitants;
	public int habitant_courant;
	public float attractivite;
	private String joueur;
	private int score;
	// limite_X => pour le mode objectif
	private int limite_argent=99999;
	private int limite_biens=99999;
	private int limite_nbhabitants=99999;
	private Temps temps;
	private AiredeJeu aire;
	public int jour;
	public int mois;
	public int annee;
	private FenetreJeu fenjeu;


	// Pour la partie en mode "libre"
	Partie(int argent, int biens, int nbhabitants, String joueur, Object type, FenetreJeu fenjeu)
	{
		this.argent = argent;
		this.biens = biens;
		this.nbhabitants = nbhabitants;
		this.joueur = joueur;
		this.fenjeu = fenjeu;
		habitant_courant = 0;
		creerAire(type.toString());
		attractivite = 1;
		jour = mois = 1;
		annee = 2011;
		
		fenjeu.getArgent().setText(""+argent);
		fenjeu.getHabitants().setText(habitant_courant+"/"+nbhabitants);
		fenjeu.getBiens().setText(""+biens);

	}

	// Pour la partie en mode "compte a rebours"
	Partie(int argent, int biens, int nbhabitants, String joueur, Object type, Temps temps)
	{
		this.argent = argent;
		this.biens = biens;
		this.nbhabitants = nbhabitants;
		this.joueur = joueur;
		creerAire(type.toString());
		this.temps = temps;
		jour = mois = 1;
		annee = 2011;
	}


	// Pour la partie en mode "objectif"
	Partie(int argent, int biens, int nbhabitants, String joueur, Object type, int limite_argent, int limite_biens, int limite_nbhabitants)
	{
		this.argent = argent;
		this.biens = biens;
		this.nbhabitants = nbhabitants;
		this.joueur = joueur;
		this.limite_argent = limite_argent;
		this.limite_biens = limite_biens;
		this.limite_nbhabitants = limite_nbhabitants;
		creerAire(type.toString());
		jour = mois = 1;
		annee = 2011;
		

	}

	private void creerAire(String type)
	{
		if(type.equals("Petite"))
			aire = new AiredeJeu(35, 35, this);
		else if(type.equals("Moyenne"))
			aire = new AiredeJeu(50, 50, this);
		else if(type.equals("Grande"))
			aire = new AiredeJeu(65, 65, this);
	}

	public void afficherAire(JPanel panel)
	{
		// Si l'aire de jeu existe deja, on la vire et on met l'autre
		try
		{
			panel.remove(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			// Si elle n'existe pas, pas besoin de la virer => on fait rien
		}
		panel.add(aire);
		panel.revalidate();
		panel.repaint();
	}
	
	public int getScore()
	{
		return score;
	}
	
	public FenetreJeu getFenJeu()
	{
		return fenjeu;
	}

	public AiredeJeu getAire() 
	{
		return aire;
	}

	
}
