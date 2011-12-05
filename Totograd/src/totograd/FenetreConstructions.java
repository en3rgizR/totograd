package totograd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class FenetreConstructions extends JDialog{
	
	private JTabbedPane tp;
	private JPanel pHabitations;
	private JPanel pServicesPubliques;
	private JPanel pMagasins;
	private JPanel pmaison;
	private JLabel lmaison;
	private JCheckBox cbmaison;
	private JPanel pimmeuble;
	private JLabel limmeuble;
	private JCheckBox cbimmeuble;
	private JPanel proute;
	private JLabel lroute;
	private JCheckBox cbroute;
	private JPanel pmairie;
	private JLabel lmairie;
	private JCheckBox cbmairie;
	private JPanel ppompier;
	private JLabel lpompier;
	private JCheckBox cbpompier;
	private JPanel phopital;
	private JLabel lhopital;
	private JCheckBox cbhopital;
	private JPanel panelbas;
	private JButton ok;
	private JButton annuler;
	
	
	public FenetreConstructions()
	{
		//super(owner);
		setTitle("Construire");
		createInterface();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void createInterface()
	{
		setSize(500,500);
		tp = new JTabbedPane(SwingConstants.TOP);
		//Onglet Habitations
		pHabitations = new JPanel(new GridLayout(2,1));
		pmaison = new JPanel(new FlowLayout());
		lmaison = new JLabel("Maison: ");
		pmaison.add(lmaison);
		cbmaison = new JCheckBox();
		pmaison.add(cbmaison);
		pHabitations.add(pmaison);		
		pimmeuble = new JPanel(new FlowLayout());
		limmeuble = new JLabel("Immeuble: ");
		pimmeuble.add(limmeuble);
		cbimmeuble = new JCheckBox();
		pimmeuble.add(cbimmeuble);
		pHabitations.add(pimmeuble);
		pHabitations.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Habitations", pHabitations);
		//Onglet Societes
		pMagasins = new JPanel();
		pMagasins.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Societes", pMagasins);
		//Onglet Services Publiques
		pServicesPubliques = new JPanel(new GridLayout(4,1));
		proute = new JPanel(new FlowLayout());
		lroute = new JLabel("Route: ");
		proute.add(lroute);
		cbroute = new JCheckBox();
		proute.add(cbroute);
		pServicesPubliques.add(proute);
		pmairie = new JPanel(new FlowLayout());
		lmairie = new JLabel("Mairie: ");
		pmairie.add(lmairie);
		cbmairie = new JCheckBox();
		pmairie.add(cbmairie);
		pServicesPubliques.add(pmairie);
		ppompier = new JPanel(new FlowLayout());
		lpompier = new JLabel("Caserne de pompier ");
		ppompier.add(lpompier);
		cbpompier = new JCheckBox();
		ppompier.add(cbpompier);
		pServicesPubliques.add(ppompier);
		phopital = new JPanel(new FlowLayout());
		lhopital = new JLabel("Hopital: ");
		phopital.add(lhopital);
		cbhopital = new JCheckBox();
		phopital.add(cbhopital);
		pServicesPubliques.add(phopital);
		pServicesPubliques.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Services Publiques", pServicesPubliques);
		tp.setOpaque(true);
		add(tp);
		
		panelbas = new JPanel(new FlowLayout());
		ok = new JButton("Ok");
		panelbas.add(ok);
		annuler = new JButton("Annuler");
		panelbas.add(annuler);
		add(panelbas, BorderLayout.SOUTH);
	}
	
}

