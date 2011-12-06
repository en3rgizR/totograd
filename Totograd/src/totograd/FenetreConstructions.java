package totograd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
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
        private JCheckBox cbmaison;
        private JPanel pimmeuble;
        private JCheckBox cbimmeuble;
        private JPanel proute;
        private JCheckBox cbroute;
        private JPanel pmairie;
        private JCheckBox cbmairie;
        private JPanel ppompier;
        private JCheckBox cbpompier;
        private JPanel phopital;
        private JCheckBox cbhopital;
        private JPanel panelbas;
        private JButton ok;
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
                setSize(500,500);
                tp = new JTabbedPane(SwingConstants.TOP);
                //Onglet Habitations
                pHabitations = new JPanel(new GridLayout(2,1));
                pmaison = new JPanel(new FlowLayout());;
                cbmaison = new JCheckBox("Maison");
                cbmaison.addActionListener(fc);
                pmaison.add(cbmaison);
                pHabitations.add(pmaison);              
                pimmeuble = new JPanel(new FlowLayout());
                cbimmeuble = new JCheckBox("Immeuble");
                cbimmeuble.addActionListener(fc);
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
                cbroute = new JCheckBox("Route");
                cbroute.addActionListener(fc);
                proute.add(cbroute);
                pServicesPubliques.add(proute);
                pmairie = new JPanel(new FlowLayout());
                cbmairie = new JCheckBox("Mairie");
                cbmairie.addActionListener(fc);
                pmairie.add(cbmairie);
                pServicesPubliques.add(pmairie);
                ppompier = new JPanel(new FlowLayout());
                cbpompier = new JCheckBox("Pompier");
                cbpompier.addActionListener(fc);
                ppompier.add(cbpompier);
                pServicesPubliques.add(ppompier);
                phopital = new JPanel(new FlowLayout());
                cbhopital = new JCheckBox("Hopital");
                cbhopital.addActionListener(fc);
                phopital.add(cbhopital);
                pServicesPubliques.add(phopital);
                pServicesPubliques.setPreferredSize(new Dimension(300, 80));
                tp.addTab("Services Publiques", pServicesPubliques);
                tp.setOpaque(true);
                add(tp);
                
                panelbas = new JPanel(new FlowLayout());
                ok = new JButton("Ok");
                ok.addActionListener(fc);
                panelbas.add(ok);
                annuler = new JButton("Annuler");
                annuler.addActionListener(fc);
                panelbas.add(annuler);
                add(panelbas, BorderLayout.SOUTH);
        }
        
        public ControleConstr getContoleur(){
        	return fc;
        }
        
        public void setcb(String s){
        	if (!s.equals(cbmairie.getText())){
        		cbmairie.setSelected(false);
        	}else if(!s.equals(cbhopital.getText())){
        		cbhopital.setSelected(false);
        	}else if (!s.equals(cbimmeuble.getText())){
        		cbimmeuble.setSelected(false);
        	}else if (!s.equals(cbpompier.getText())){
        		cbpompier.setSelected(false);
        	}else if (!s.equals(cbroute.getText())){
        		cbroute.setSelected(false);
        	}else if (!s.equals(cbmaison.getText())){
        		cbmaison.setSelected(false);
        	}
        }
        
        public Case getCase()
        {
        	return case_const;
        }
}
