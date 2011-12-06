package totograd;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class FenetreConstructions extends JDialog{
        
        private JTabbedPane tp;
        private JPanel pHabitations;
        private JPanel pServicesPubliques;
        private JPanel pSocietes;
        private JPanel pInfrastructures;
        private JPanel pmaison;
        private JButton cbmaison;
        private JPanel pimmeuble;
        private JButton cbimmeuble;
        private JPanel proute;
        private JButton cbroute;
        private JPanel pmairie;
        private JButton cbmairie;
        private JPanel ppompier;
        private JButton cbpompier;
        private JPanel phopital;
        private JButton cbhopital;
        private JPanel panelbas;
        private JButton annuler;
        private ControleConstr fc;
        private Case case_const;
        
        public FenetreConstructions(Case case_const)
        {
                setTitle("Construire");
                fc = new ControleConstr(this);
                createInterface();
                setLocationRelativeTo(null);
                setVisible(true);
        }
        
        public void createInterface()
        {
                setSize(450,250);
                tp = new JTabbedPane(SwingConstants.TOP); 
                tp.setSize(100,5);
                //Onglet Habitations
                pHabitations = new JPanel(new GridLayout(2,1));
                pmaison = new JPanel(new FlowLayout());;
                cbmaison = new JButton("Maison");
                cbmaison.addActionListener(fc);
                pmaison.add(cbmaison);
                pHabitations.add(pmaison);              
                pimmeuble = new JPanel(new FlowLayout());
                cbimmeuble = new JButton("HLM");
                cbimmeuble.addActionListener(fc);
                pimmeuble.add(cbimmeuble);
                pHabitations.add(pimmeuble);
                pHabitations.setPreferredSize(new Dimension(300, 80));
                tp.addTab("Habitations", pHabitations);
                //Onglet Societes
                pSocietes = new JPanel();
                pSocietes.setPreferredSize(new Dimension(300, 80));
                tp.addTab("Societes", pSocietes);
                //Onglet Services Publiques
                pServicesPubliques = new JPanel(new GridLayout(4,1));
                pmairie = new JPanel(new FlowLayout());
                cbmairie = new JButton("Mairie");
                cbmairie.addActionListener(fc);
                pmairie.add(cbmairie);
                pServicesPubliques.add(pmairie);
                ppompier = new JPanel(new FlowLayout());
                cbpompier = new JButton("Caserne de pompiers");
                cbpompier.addActionListener(fc);
                ppompier.add(cbpompier);
                pServicesPubliques.add(ppompier);
                phopital = new JPanel(new FlowLayout());
                cbhopital = new JButton("Hôpital");
                cbhopital.addActionListener(fc);
                phopital.add(cbhopital);
                pServicesPubliques.add(phopital);
                pServicesPubliques.setPreferredSize(new Dimension(300, 80));
                tp.addTab("Services Publiques", pServicesPubliques);
                // Onglet Infrastructures
                pInfrastructures = new JPanel(new GridLayout(1, 1));
                proute = new JPanel(new FlowLayout());
                cbroute = new JButton("Route");
                cbroute.addActionListener(fc);
                proute.add(cbroute);
                pInfrastructures.add(proute);
                tp.addTab("Infrastructures", pInfrastructures);
                tp.setOpaque(true);
                add(tp);
                
                panelbas = new JPanel(new FlowLayout());
                annuler = new JButton("Annuler");
                annuler.addActionListener(fc);
                panelbas.add(annuler);
                add(panelbas, BorderLayout.SOUTH);
        }
        
        public ControleConstr getContoleur(){
        	return fc;
        }
        
        public void setcb(String s)
        {
        	if (!s.equals(cbmairie.getText()))
        	{
        		cbmairie.setSelected(false);
        	}
        	else if(!s.equals(cbhopital.getText()))
        	{
        		cbhopital.setSelected(false);
        	}
        	else if (!s.equals(cbimmeuble.getText()))
        	{
        		cbimmeuble.setSelected(false);
        	}
        	else if (!s.equals(cbpompier.getText()))
        	{
        		cbpompier.setSelected(false);
        	}
        	else if (!s.equals(cbroute.getText()))
        	{
        		cbroute.setSelected(false);
        	}
        	else if (!s.equals(cbmaison.getText()))
        	{
        		cbmaison.setSelected(false);
        	}
        }
        
        public Case getCase()
        {
        	return case_const;
        }
}
