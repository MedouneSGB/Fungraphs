/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 
 * @author M.DalandaBalde c'estait l'ordi de ma soeur :)*
 */
   import javax.swing.*;  
   import java.awt.Graphics;
   import java.awt.*;
   import java.awt.event.*;

/**
 *
 * @author M.DalandaBalde
 */
public class Projet3 extends JFrame implements ActionListener{
   
   Container container;
   private JLabel etiquette;
   private JLabel etiquette2;
   private JLabel etiquette3;
   private JLabel etiquette4;
   private JLabel etiquette5;
   private JLabel etiquette6;
   private DefaultComboBoxModel comboModel;
   private DefaultComboBoxModel comboModel1;
   private DefaultComboBoxModel comboModel2;
   private JComboBox jcb;
   private JComboBox jcb1;
   private JComboBox jcb2;
   private JButton bouton1;
   private JButton bouton2;
   private JButton bouton3;
   private JButton bouton4;
   private JButton bouton5;
   private JButton bouton6;
   private JButton bouton7;
   private JButton bouton8;
   private JButton bouton9;
   private JButton bouton10;
   private boolean ferme1 = false;
   private boolean ferme2 = false;
   private boolean ferme3 = false;
   private boolean ferme4 = false;
   private boolean ferme5 = false;
   Font f = new Font("Verdana", Font.BOLD + Font.ITALIC,30);
   Font f1 = new Font("Verdana", Font.ITALIC,14);
   private boolean a = false;
   private boolean b = false;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean h = false;
   private boolean a1 = false;
   private boolean b1 = false;
   private boolean c1 = false;
   private boolean d1 = false;
   private boolean e1 = false;
   private boolean h1 = false;
   private boolean dinam = false;
   int tx; int lx; int ax; int bx;
   Timer chrono = new Timer(700, this);
   int dx = 0;

 
   public Projet3()
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
		panel.setLayout(null); 		
		
                ImageIcon image = new ImageIcon(getClass().getResource("/javaapplication2/img/Capture2.png"));
setIconImage(image.getImage());
JLabel icone =new JLabel(image);
panel.add(icone);
                
		comboModel = new DefaultComboBoxModel();
		comboModel.addElement("Rouge");
		comboModel.addElement("Bleu");
		comboModel.addElement("Vert");
		comboModel.addElement("Blanc");
		comboModel.addElement("Gris");
		comboModel.addElement("Jaune");
		jcb = new JComboBox(comboModel);
		this.jcb.setBounds(300,158,100,30);
		panel.add(jcb);
		this.jcb.addActionListener(this);
		repaint();
		
		comboModel1 = new DefaultComboBoxModel();
		comboModel1.addElement("Rouge");
		comboModel1.addElement("Bleu");
		comboModel1.addElement("Vert");
		comboModel1.addElement("Blanc");
		comboModel1.addElement("Gris");
		comboModel1.addElement("Jaune");
		jcb1 = new JComboBox(comboModel1);
		this.jcb1.setBounds(50,158,100,30);
		panel.add(jcb1);
		this.jcb1.addActionListener(this);
		repaint();
	
	
   etiquette = new JLabel();
   this.etiquette.setBounds(160,35,350,60);
   this.etiquette.setFont(f1);
   this.etiquette.setText("Que voulez vous dessiner ?");
   panel.add(etiquette);    
   
   etiquette2 = new JLabel();
   this.etiquette2.setBounds(50,115,350,60);
   this.etiquette2.setFont(f1);
   this.etiquette2.setText("Choisir coleur de Ligne");
   panel.add(etiquette2); 

   etiquette3 = new JLabel();
   this.etiquette3.setBounds(300,115,350,60);
   this.etiquette3.setFont(f1);
   this.etiquette3.setText("Choisir coleur de Remplissage");
   panel.add(etiquette3);  
		
   etiquette4 = new JLabel();
   this.etiquette4.setBounds(50,180,350,60);
   this.etiquette4.setFont(f1);
   this.etiquette4.setText("Taille");
   panel.add(etiquette4); 		
   
   etiquette5 = new JLabel();
   this.etiquette5.setBounds(300,180,350,60);
   this.etiquette5.setFont(f1);
   this.etiquette5.setText("Dynamiser");
   panel.add(etiquette5); 		
   
   bouton1 = new JButton ();
   this.bouton1.setText("ligne");
   this.bouton1.setBounds(35,80,80,40);
   panel.add(bouton1);
   this.bouton1.addActionListener(this);
  
   bouton2 = new JButton ();
   this.bouton2.setText("rectangle");
   this.bouton2.setBounds(120,80,80,40);
   panel.add(bouton2);
   this.bouton2.addActionListener(this);
   
   bouton3 = new JButton ();
   this.bouton3.setText("cercle");
   this.bouton3.setBounds(205,80,80,40);
   panel.add(bouton3);
   this.bouton3.addActionListener(this);
   
   bouton4 = new JButton ();
   this.bouton4.setText("Polygon");
   this.bouton4.setBounds(290,80,80,40);
   panel.add(bouton4);
   this.bouton4.addActionListener(this);   
  
   bouton5 = new JButton ();
   this.bouton5.setText("effacer");
   this.bouton5.setBounds(460,80,80,40);
   panel.add(bouton5);
   this.bouton5.addActionListener(this);  
  
   bouton6 = new JButton ();
   this.bouton6.setText("+");
   this.bouton6.setBounds(100,200,45,20);
   panel.add(bouton6);
   this.bouton6.addActionListener(this);  
  
  bouton7 = new JButton ();
   this.bouton7.setText("-");
   this.bouton7.setBounds(160,200,45,20);
   panel.add(bouton7);
   this.bouton7.addActionListener(this);
  
  bouton8 = new JButton ();
   this.bouton8.setText("ON");
   this.bouton8.setBounds(380,200,55,20);
   panel.add(bouton8);
   this.bouton8.addActionListener(this);
  
  bouton9 = new JButton ();
   this.bouton9.setText("OFF");
   this.bouton9.setBounds(450,200,55,20);
   panel.add(bouton9);
   this.bouton9.addActionListener(this);
  
  bouton10 = new JButton ();
   this.bouton10.setText("Ellipse");
   this.bouton10.setBounds(375,80,80,40);
   panel.add(bouton10);
   this.bouton10.addActionListener(this);
   repaint();
 }	
   @Override
    public void actionPerformed(ActionEvent ae){
   
		if(jcb.getSelectedItem() == "Rouge"){a = true;b = false;c = false;d = false;e = false;h = false;  repaint();}
		if(jcb.getSelectedItem() == "Bleu"){a = false;b = true;c = false;d = false;e = false;h = false;  repaint();}
		if(jcb.getSelectedItem() == "Vert"){a = false;b = false;c = true;d = false;e = false;h = false;  repaint();}
		if(jcb.getSelectedItem() == "Blanc"){a = false;b = false;c = false;d = true;e = false;h = false;  repaint();}
		if(jcb.getSelectedItem() == "Gris"){a = false;b = false;c = false;d = false;e = true;h = false;  repaint();}
		if(jcb.getSelectedItem() == "Jaune"){a = false;b = false;c = false;d = false;e = false;h = true;  repaint();}
		else{repaint();}
   
		if(jcb1.getSelectedItem() == "Rouge"){a1 = true;b1 = false;c1 = false;d1 = false;e1 = false;h1 = false;  repaint();}
		if(jcb1.getSelectedItem() == "Bleu"){a1 = false;b1 = true;c1 = false;d1 = false;e1 = false;h1 = false;  repaint();}
		if(jcb1.getSelectedItem() == "Vert"){a1 = false;b1 = false;c1 = true;d1 = false;e1 = false;h1 = false;  repaint();}
		if(jcb1.getSelectedItem() == "Blanc"){a1 = false;b1 = false;c1 = false;d1 = true;e1 = false;h1 = false;  repaint();}
		if(jcb1.getSelectedItem() == "Gris"){a1 = false;b1 = false;c1 = false;d1 = false;e1 = true;h1 = false;  repaint();}
		if(jcb1.getSelectedItem() == "Jaune"){a1 = false;b1 = false;c1 = false;d1 = false;e1 = false;h1 = true;  repaint();}
		else{repaint();}
   

   
    if(ae.getSource() == this.bouton1){
    ferme1 = true;
	ferme2 = false;
	ferme3 = false;
	ferme4 = false;
	ferme5 = false;
	repaint();
   }
    if(ae.getSource() == this.bouton2){
	ferme1 = false;	
    ferme2 = true;
	ferme3 = false;
	ferme4 = false;
	ferme5 = false;
	repaint();
   }
    if(ae.getSource() == this.bouton3){
	ferme1 = false;	
    ferme2 = false;
	ferme3 = true;
	ferme4 = false;
	ferme5 = false;
	repaint();
   }
    if(ae.getSource() == this.bouton4){
	ferme1 = false;	
    ferme2 = false;
	ferme3 = false;
	ferme4 = true;
	ferme5 = false;
	repaint();
   }
    if(ae.getSource() == this.bouton5){
	ferme1 = false;	
    ferme2 = false;
	ferme3 = false;
	ferme4 = false;
	ferme5 = false;
	dinam = false;repaint();
	chrono.stop();
	repaint();
   }
    if(ae.getSource() == this.bouton10){
	ferme1 = false;	
    ferme2 = false;
	ferme3 = false;
	ferme4 = false;
	ferme5 = true;
	repaint();
   }
    if(ae.getSource() == this.bouton6){  
    if(tx <=30){
    tx = tx +10;
    lx = tx + 5;
   }
   }
    if(ae.getSource() == this.bouton7){  
    if(tx >=-30){
    tx = tx - 10;
    lx = tx - 5;
   }
   }
    if(ae.getSource() == this.bouton8){
	dinam = true;
	chrono.start();
	repaint();	
   }
    if(ae.getSource() == this.bouton9){
	dinam = false;repaint();
	chrono.stop();
   }
    repaint();
   }
   
   
   
   @Override
   public void paint(Graphics g)
	{
	super.paint(g);
	g.setColor(Color.black);
	g.drawRect(15,30,560,530);
	g.drawLine(15,270,565,270);
	g.drawLine(15,160,565,160);
	g.drawLine(285,160,285,270);
	g.setColor(Color.lightGray);
	g.fillRect(45,50,495,30);
	g.setColor(Color.black);
	g.setFont(f);
	g.drawString("Mon Application Peinte",110,74);	
	g.setColor(Color.black);
	g.fillRect(45,300,495,245);
	if(a == true){g.setColor(Color.red);}
	if(b == true){g.setColor(Color.blue);}
	if(c == true){g.setColor(Color.green);}
	if(d ==true){g.setColor(Color.white);}
	if(e ==true){g.setColor(Color.lightGray);}
	if(h == true){g.setColor(Color.yellow);}
    if(dinam == true){
	dx = dx + 1;
	if(dx >=19)
	{
	   dx = 0;
	   dx = dx + 1;
	}
	
	
		if(dx == 1){tx =-20;lx =-50;g.setColor(Color.red);}
		if(dx == 2){tx =-15;lx =-40;g.setColor(Color.blue);}
		if(dx == 3){tx =-10;lx =-30;g.setColor(Color.lightGray);}
		if(dx == 4){tx =-5;lx =-20;g.setColor(Color.yellow);}
		if(dx == 5){tx =0;lx =-10;g.setColor(Color.white);}		
		if(dx == 6){tx =5;lx =0;g.setColor(Color.green);}
		
		if(dx == 7){tx =10;lx =10;g.setColor(Color.red);}
		if(dx == 8){tx =20;lx =20;g.setColor(Color.blue);}
		if(dx == 9){tx =30;lx =30;g.setColor(Color.lightGray);}
		if(dx == 10){tx =30;lx =30;g.setColor(Color.yellow);}
		if(dx == 11){tx =20;lx =20;g.setColor(Color.white);}		
		if(dx == 12){tx =10;lx =10;g.setColor(Color.green);}
		
		if(dx == 13){tx =5;lx =0;g.setColor(Color.red);}
		if(dx == 14){tx =0;lx =-10;g.setColor(Color.blue);}
		if(dx == 15){tx =-5;lx =-20;g.setColor(Color.lightGray);}
		if(dx == 16){tx =-10;lx =-30;g.setColor(Color.yellow);}
		if(dx == 17){tx =-15;lx =-40;g.setColor(Color.white);}		
		if(dx == 18){tx =-20;lx =-50;g.setColor(Color.green);}	
		
		
	}
	if(ferme1 == true){
	g.drawLine(160-tx,418,410+tx,418);
	g.drawLine(160-tx,419,410+tx,419);
	g.drawLine(160-tx,420,410+tx,420);
	g.drawLine(160-tx,421,410+tx,421);
	g.drawLine(160-tx,422,410+tx,422);
	g.drawLine(160-tx,423,410+tx,423);
	}
	if(ferme2 == true){
	g.fillRect(180-tx,360-lx,210+tx+tx,120+lx+lx);
	}
	if(ferme3 == true){
	g.fillOval(210-tx,345-tx,150+tx+tx,150+tx+tx);
	}
	if(ferme5 == true){
	g.fillOval(160-tx,345-tx,250+tx+tx,150+tx+tx);
	}
	if(ferme4 == true){	
	int x[] = {210-tx,240-tx,330+tx,360+tx,330+tx,240-tx};
	int y[] = {420,360-lx,360-lx,420,480+lx,480+lx};
	int n = 6;
	g.fillPolygon(x,y,n);
	}

	if(a1 == true){g.setColor(Color.red);}
	if(b1 == true){g.setColor(Color.blue);}
	if(c1 == true){g.setColor(Color.green);}
	if(d1 ==true){g.setColor(Color.white);}
	if(e1 ==true){g.setColor(Color.lightGray);}
	if(h1 == true){g.setColor(Color.yellow);}
	if(dinam == true){
	
		if(dx == 1){tx =10;lx =5;g.setColor(Color.green);}
		if(dx == 2){tx =20;lx =10;g.setColor(Color.white);}	
		if(dx == 3){tx =30;lx =15;g.setColor(Color.red);}
		if(dx == 4){tx =30;lx =15;g.setColor(Color.blue);}
		if(dx == 5){tx =20;lx =10;g.setColor(Color.yellow);}	
		if(dx == 6){tx =10;lx =5;g.setColor(Color.lightGray);}
		
	}
	
	if(ferme1 == true){
	g.drawLine(160-tx,418,410+tx,418);//L
	g.drawLine(160-tx,419,410+tx,419);//L
	g.drawLine(160-tx,418,160-tx,423);//l
	g.drawLine(161-tx,418,161-tx,423);//l
	g.drawLine(410+tx,418,410+tx,423);//l
	g.drawLine(160-tx,423,410+tx,423);//L
	g.drawLine(160-tx,422,410+tx,422);//L
	}
	if(ferme2 == true){
	g.drawRect(180-tx,360-lx,210+tx+tx,120+lx+lx);
	}
	if(ferme3 == true){
	g.drawOval(210-tx,345-tx,150+tx+tx,150+tx+tx);
	}
	if(ferme5 == true){
	g.drawOval(160-tx,345-tx,250+tx+tx,150+tx+tx);
	}
	if(ferme4 == true){	
	int x[] = {210-tx,240-tx,330+tx,360+tx,330+tx,240-tx};
	int y[] = {420,360-lx,360-lx,420,480+lx,480+lx};
	int n = 6;
	g.drawPolygon(x,y,n);
	}
	
	if(ferme1 == true || ferme2 == true || ferme3 == true || ferme4 == true || ferme5 == true  ){
	if(dinam ==true){
	int x2[] = {240+tx,270+tx,300-tx,330-tx,300-tx,270+tx};
	int y2[] = {420,375+lx,375+lx,420,465-lx,465-lx};
	int n2 = 6;
	g.fillPolygon(x2,y2,n2);	
	}
	}
	}
  }
