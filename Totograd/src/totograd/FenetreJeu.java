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

	private static FenetreJeu instance;

	private JButton construire;
	private FenetreCreaPartie fenetre1 = FenetreCreaPartie.getInstance(this);
	private FenetreHighScores fenetre2 = FenetreHighScores.getInstance(this);
	private FenetreConstructions fenetre3 = FenetreConstructions.getInstance(this);
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
	 * @return
	 */
	public static FenetreJeu getInstance() {		
		if (null == instance) {
			instance = new FenetreJeu();
		}
		return instance;
	}

	/**
	 * 
	 * 
	 */
	private FenetreJeu()
	{
		super();
		setTitle("TotoGrad");
		//fenetre1 = FenetreCreaPartie.getInstance(this);
		ctrljeu = new ControleJeu(this, fenetre1, fenetre2, fenetre3);	
		createInterface();
		setLocationRelativeTo(null);
		setResizable(false);
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

		/*AiredeJeu adj = new AiredeJeu(100, 100);
		adj.Initialize(10, 10);
		add(adj, BorderLayout.CENTER);
		 */
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
		FenetreJeu jeu = getInstance();
		jeu.setSize(1000, 600);
		jeu.setVisible(true);
		System.out.println("jeu : "+jeu);

	}


}
