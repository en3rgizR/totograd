package totograd;

import java.awt.*;
import java.util.Hashtable;
import javax.swing.*;

@SuppressWarnings("serial")
public class FenetreJeu extends JFrame
{
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem jouer;
	private JMenuItem quitter;
	private JMenuItem highScores;
	public JMenu clock;
	public JMenu argent;
	public JMenu habitants;
	public JMenu biens;
	public JMenu attractivite;
	private Hashtable<String, Integer> bestScores;
	private ControleJeu ctrljeu;
	public JPanel panmain;
	public BorderLayout blayout;
	private Jeu jeu;
	private JPanel panelbas;
	private JButton construire;
	private JButton detruire;

	/**
	 * @param jeu 
	 * 
	 * 
	 */
	FenetreJeu(Jeu jeu)
	{
		super();
		this.jeu = jeu;
		ctrljeu = new ControleJeu(this);
		createInterface();
		//setLocationRelativeTo(null);
		this.setSize(1250, 650);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	/**
	 * 
	 */
	public void createInterface()
	{
		panmain = new JPanel();
		setContentPane(panmain);
		GridLayout gl = new GridLayout(1, 0);
		panmain.setLayout(gl);
	
		bar = new JMenuBar();
		menu = new JMenu("Menu");
		menu.addSeparator();

		clock = new JMenu("01/01/2011");
		clock.setIcon(new ImageIcon(getClass().getResource("calendrier.png")));
		
		argent = new JMenu("0          ");
		argent.setIcon(new ImageIcon(getClass().getResource("argent.png")));
		habitants = new JMenu("0         ");
		habitants.setIcon(new ImageIcon(getClass().getResource("habitants.png")));
		biens = new JMenu("0         ");
		biens.setIcon(new ImageIcon(getClass().getResource("biens.png")));
		attractivite = new JMenu("0			");
		attractivite.setIcon(new ImageIcon(getClass().getResource("attractivite.png")));
		
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
		bar.add(clock);
		bar.add(argent);
		bar.add(habitants);
		bar.add(biens);
		bar.add(attractivite);
		setJMenuBar(bar);

	}

	public Hashtable<String, Integer> getHT()
	{
		return bestScores;
	}
	
	public Jeu getJeu()
	{
		return jeu;
	}

	public JMenu getArgent() 
	{
		return argent;
	}

	public JMenu getHabitants() 
	{
		return habitants;
	}
	
	public JMenu getBiens() 
	{
		return biens;
	}
	
	public JMenu getAttractivite()
	{
		return attractivite;
	}

}

