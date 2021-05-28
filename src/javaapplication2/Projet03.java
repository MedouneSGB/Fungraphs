/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author M.DalandaBalde
 */
   import javax.swing.*;  
   import java.awt.Graphics;
   import java.awt.*;
   import java.awt.event.*;

/**
 *
 * @author M.DalandaBalde c'estait l'ordi de ma soeur :)*
 */
public class Projet03 extends JFrame implements ActionListener{
   
   Container container;
   
   private JLabel etiquette;
   private JLabel etiquette2;
   private JLabel etiquette3;
   private JButton bouton1;
   private JButton bouton2;
   private JButton bouton3;
   Font f = new Font("Verdana", Font.BOLD + Font.ITALIC,23);
   Font f1 = new Font("Verdana",Font.ITALIC,13);

   @Override
   public void paint(Graphics g)
	{
	super.paint(g);
	g.setColor(Color.black);
	g.drawRect(15,40,560,525);
	g.drawRect(18,129,554,356);
	g.setColor(Color.white);
	g.fillRect(19,130,553,355);

	g.setColor(Color.black);
	g.setFont(f);
	g.drawString("Condition d'Utilisation",130,74);
	g.setFont(f1);
	g.drawString("Ce logiciel nommé FunGraphs vous permet de faire des dessins graphiques,",22,150);
	g.drawString("Il est composé de 10 bouttons et de 2 zones déroulantes qui sont:  ",22,167);
	g.drawString("ligne: Vous permet de dessiner une ligne ",22,184);
	g.drawString("rectangle: Vous permet de dessiner un rectangle ",22,203);
	g.drawString("cercle: Vous permet de dessiner une cercle ",22,220);
	g.drawString("Polygon: Vous permet de dessiner une Polygon",22,237);
	g.drawString("Ellipse: Vous permet de dessiner une Ellipse",22,254);
	g.drawString("Effacer: Vous permet d'Effacer les Graphs",22,271);
	g.drawString("Taille +: Vous permet d'augmenter la tailles des Graphs",22,288);
	g.drawString("Taille -: Vous permet de diminuer la tailles des Graphs",22,306);
	g.drawString("Dynamiser ON: Vous permet dynamiser les Graphs",22,322);
	g.drawString("Dynamiser OFF: Vous permet de desactiver le dynamisme des dynamiser ",22,339);
	g.drawString("les Graphs",22,356);
	g.drawString("Choisir couleur de Ligne: Vous permet de changer la couleur de bords des Graphs",22,373);
	g.drawString("Choisir couleur de Remplissage: Vous permet de changer la couleur de Fond",22,390);
	g.drawString("des Graphs",22,407);
	g.drawString("En appuyant sur le boutton ACCEPTER vous approuver avoir lu et compris  ",22,427); 
	g.drawString("les CONDITIONS D'UTILISATION de l'application ",22,444); 
	g.drawString("la page suivante vous demandera de vous connecter veullez vous identifier",22,461);
	
	
	}
 
   public Projet03()
   {
	super("FunGraphs");
	initialize();

	}

	private void initialize() {
	
		container = getContentPane();
		JPanel panel = new JPanel();
		setSize(590,580);
                setLocationRelativeTo(null);
		setTitle("FunGraphs");
                setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		etiquette = new JLabel();
		add(panel);
		setVisible(true);
                //setAlwaysOnTop(true);
		panel.setLayout(null); 	
		
	ImageIcon image = new ImageIcon(getClass().getResource("/javaapplication2/img/Capture2.png"));
setIconImage(image.getImage());
JLabel icone =new JLabel(image);
panel.add(icone);	
		
		
   bouton1 = new JButton ();
   this.bouton1.setText("Accepter");
   this.bouton1.setBounds(240,480,90,40);
   panel.add(bouton1);
   this.bouton1.addActionListener(this);
		
	}	
   @Override
    public void actionPerformed(ActionEvent ae){	
		    if(ae.getSource() == this.bouton1){
	setVisible(false);
	Projet033 Projet033 = new Projet033();
	Projet033.setVisible(true);}
	}

  }
