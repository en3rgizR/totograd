package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleHigh implements ActionListener
{
	private FenetreHighScores high;
	
	public ControleHigh(FenetreHighScores high)
	{
		this.high = high;
	}

	public void actionPerformed(ActionEvent e) 
	{
		String source = e.getActionCommand();
		
		if(source.equals("Ok"))
			high.dispose();
		
	}

}
