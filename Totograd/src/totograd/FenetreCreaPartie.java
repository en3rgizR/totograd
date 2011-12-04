package totograd;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FenetreCreaPartie extends JDialog
{
	
	private static FenetreCreaPartie instance;
	
	private JButton ok;
	private JButton annuler;
	private JPanel panel;
	private JLabel lnom;
	private JTextField tfNom;
	private JLabel ltype;
	private JComboBox cbTypePartie;
	private JLabel lTaille;
	private JComboBox cbTailleGrille;
	private ControleCreaPartie ctrlcrea;
	private FenetreJeu owner;
	
	/**
	 * 
	 * @param owner
	 * @return
	 */
	public static FenetreCreaPartie getInstance(FenetreJeu owner) {
		
        if (null == instance) {
            instance = new FenetreCreaPartie(owner);
        }
        return instance;
    }
	
	/**
	 * 
	 * @param owner
	 */
	public FenetreCreaPartie(FenetreJeu owner)
	{
		super(owner);
		this.owner = owner;
		System.out.println("const owner : "+owner);
		ctrlcrea = new ControleCreaPartie(this);
		createInterface();
		setTitle("Creer une partie");
		setLocationRelativeTo(owner);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 * 
	 */
	public void createInterface()
	{			
			this.setSize(400,150);
			
			panel = new JPanel();
			panel.setLayout( new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			lnom = new JLabel("Votre nom : ");
			gbc.gridx = 0;
			gbc.gridy = 0;
			panel.add(lnom, gbc);
			
			tfNom = new JTextField("Toto", 20);
			gbc.gridx = 1;
			panel.add(tfNom, gbc);
			
			ltype = new JLabel ("Type de partie : ");
			gbc.gridx=0;
			gbc.gridy=1;
			panel.add(ltype, gbc);
			
			String[] choix1 = {"Libre","Compte a rebours"};
			cbTypePartie = new JComboBox(choix1);
			gbc.gridx=1;
			panel.add(cbTypePartie, gbc);
			
			lTaille = new JLabel("Taille de la carte :");
			gbc.gridx=0;
			gbc.gridy=2;
			panel.add(lTaille, gbc);
			
			String[] choix2 = {"Petite", "Moyenne","Grande"};
			cbTailleGrille = new JComboBox(choix2);
			gbc.gridx=1;
			panel.add(cbTailleGrille, gbc);
			
			ok = new JButton("OK");
			ok.addActionListener(ctrlcrea);
			gbc.gridx=0;
			gbc.gridy=3;
			panel.add(ok,gbc);
			
			annuler = new JButton("Annuler");
			annuler.addActionListener(ctrlcrea);
			gbc.gridx=1;
			panel.add(annuler,gbc);
			
			setContentPane(panel);
	}
	
	public FenetreJeu getOwner()
	{
		return owner;
	}
	
	public JComboBox getTaille()
	{
		return cbTailleGrille;
	}

}
