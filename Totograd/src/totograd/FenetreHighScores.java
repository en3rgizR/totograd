package totograd;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreHighScores extends JDialog
{


	private JButton ok;
	private JPanel panelSco;
	private JPanel panel;
	private FenetreJeu owner;
	private ControleHigh ctrlhigh;

	/**
	 * 
	 * @param owner
	 */
	FenetreHighScores(FenetreJeu owner)
	{
		super(owner);
		this.owner = owner;
		ctrlhigh = new ControleHigh(this);
		setTitle("Les meilleurs scores");
		setResizable(false);
		setLocationRelativeTo(null);
		createInterface();
		setVisible(true);
		pack();
	}

	/**
	 * 
	 */
	public void createInterface()
	{
		
		int size = owner.getHT().size();
		panelSco = new JPanel(new GridLayout(size+1, 2));

		for (Map.Entry<String, Integer> e : owner.getHT().entrySet())
		{
			JLabel nom = new JLabel(e.getKey() +" : ");
			JLabel valeur = new JLabel(e.getValue().toString()+"\n");
			panelSco.add(nom);
			panelSco.add(valeur);
			
		}
		
		panel = new JPanel(new BorderLayout());
		panel.add(panelSco);
		ok = new JButton("Ok");
		ok.addActionListener(ctrlhigh);
		panel.add(ok, BorderLayout.SOUTH);
		setContentPane(panel);
		
		
	}

}
