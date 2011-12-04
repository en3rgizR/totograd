package totograd;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreJeu extends JFrame
{

	private JButton construire;
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem jouer;
	private JMenuItem quitter;
	private JMenuItem highScores;
	private Hashtable<String, Integer> bestScores;
	private ControleJeu ctrljeu;
	public JPanel panmain;
	public BorderLayout blayout;

	/**
	 * 
	 * 
	 */
	private FenetreJeu()
	{
		super();
		ctrljeu = new ControleJeu(this);
		createInterface();
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bestScores = new Hashtable<String, Integer>(10);
		bestScores.put("Toto", 5000);
		bestScores.put("Jenna", 3500);
		bestScores.put("lio", 7895);
		
	}

	/**
	 * 
	 */
	public void createInterface()
	{
		panmain = new JPanel();
		setContentPane(panmain);
		blayout = new BorderLayout();
		panmain.setLayout(blayout);

		bar = new JMenuBar();
		menu = new JMenu("Menu");
		menu.addActionListener(ctrljeu);
		jouer = new JMenuItem("Jouer une partie");
		jouer.addActionListener(ctrljeu);
		menu.add(jouer);
		highScores = new JMenuItem("High Scores");
		highScores.addActionListener(ctrljeu);
		menu.add(highScores);
		quitter = new JMenuItem("Quitter");
		quitter.addActionListener(ctrljeu);
		menu.add(quitter);
		bar.add(menu);
		setJMenuBar(bar);

		construire = new JButton("Construire");
		construire.addActionListener(ctrljeu);
		panmain.add(construire, blayout.EAST);

	}

	public Hashtable<String, Integer> getHT(){
		return bestScores;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		FenetreJeu jeu = new FenetreJeu();
		jeu.setSize(1000, 600);
		jeu.setVisible(true);
		jeu.setResizable(true);

	}


}

