package totograd;

import java.util.*;

/*
 * La classe temps permet de lancer un timer qui va :
 * => A partir de la secondes "start"
 * => Toutes les "temps" secondes
 * =====> Lancer la tache de Temptask, qui est thread� par d�faut (grace a TimerTask qui implemente runnable)
 */
public class Temps
{
	Timer timer;

    public Temps(int start, int temps, FenetreJeu fenjeu, Partie partie) 
    {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TempsTask(fenjeu, partie), start, temps * 100); // 1000 car Millisecondes ! 
	}
    
    public class TempsTask extends TimerTask 
    {
    	Partie partie;
    	FenetreJeu fenjeu;
    	public TempsTask(FenetreJeu fenjeu, Partie partie) 
    	{
    		this.partie = partie;
    		this.fenjeu = fenjeu;
    	}

		public void run() 
    	{
    		partie.jour++;
    		if(partie.jour >= 30)
    		{
    			partie.jour=1;
    			partie.mois++;
    			if(partie.mois > 12)
    				partie.annee++;
    		}
    		if((partie.jour/10) < 1 )
    		{
    			if((partie.mois/10) < 1)
    				fenjeu.clock.setText("0"+partie.jour+"/0"+partie.mois+"/"+partie.annee);
    			else
    				fenjeu.clock.setText("0"+partie.jour+"/"+partie.mois+"/"+partie.annee);
    		}
    		else
    		{
    			if((partie.mois/10) < 1)
    				fenjeu.clock.setText(partie.jour+"/0"+partie.mois+"/"+partie.annee);
    			else
    				fenjeu.clock.setText(partie.jour+"/"+partie.mois+"/"+partie.annee);
    		}
    		
    	}
    }

}
