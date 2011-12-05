package totograd;

import java.util.HashMap;

public class Jeu 
{
	private HashMap<String, Integer> highobj;
	private HashMap<String, Integer> highlibre;
	private HashMap<String, Integer> highrebours;

	
	Jeu()
	{
		highobj = new HashMap<String, Integer>();
		highlibre = new HashMap<String, Integer>();
		highrebours = new HashMap<String, Integer>();
		FenetreJeu fenjeu = new FenetreJeu(this);
	}
	
	public void addHighObj(String key, Integer value)
	{
		highobj.put(key, value);
	}
	
	public void addHighLibre(String key, Integer value)
	{
		highlibre.put(key, value);
	}
	
	public void addHighRebours(String key, Integer value)
	{
		highrebours.put(key, value);
	}

}
