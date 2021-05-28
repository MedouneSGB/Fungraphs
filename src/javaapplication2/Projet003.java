package javaapplication2;
   import javax.swing.*;  
   import java.awt.Graphics;
   import java.awt.*;
   import java.awt.event.*;


/*
 * @author M.DalandaBalde c'estait l'ordi de ma soeur :)*
 */
   public class Projet003 extends JFrame implements ActionListener{
   
   Container container;
   private JLabel etiquette;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   Font f1 = new Font("Verdana",Font.ITALIC,13);
   
Timer chrono = new Timer(3, this);
int ax =0;
int tx = 0;
int tx1 = -100;
int re = 415;
int cont=2;
public Projet003()
	{
	super("Frame");
	initialize();
	if(cont == 2){
	chrono.start();
	}
}


   @Override
   public void paint(Graphics g)
	{
super.paint(g);


//cordes

//ciel
g.setColor(Color.cyan);
g.fillRect(20,350,545,85);//route1

g.setColor(Color.black);
//g.fillRect(0,345,20,108);//debut
//g.fillRect(565,345,15,108);//debut

 //route
g.setColor(Color.gray);
g.fillRect(20,421,545,31);//route1
g.setColor(Color.black);
g.drawLine(20,452,564,452);//pont trait inf
g.drawLine(20,420,564,420);//pont trait sup
g.drawArc(20,370,544,155,0,180);//arc 2 inf
g.setColor(Color.black);
g.drawArc(20,350,544,155,0,180);//arc 1 sup

//bord haut
g.drawLine(50,420,80,378);
g.drawLine(150,420,190,354);
g.drawLine(250,420,290,350);
g.drawLine(350,420,390,356);
g.drawLine(450,420,478,370);



//voiture jaune
g.setColor(Color.yellow);
int x[] = {170+ tx+ tx1,180+ tx+ tx1,200+ tx+ tx1,212+ tx+ tx1,222+ tx+ tx1,222+ tx+ tx1,217+ tx+ tx1,217+ tx+ tx1,212+ tx+ tx1,212+ tx+ tx1,182+ tx+ tx1,182+ tx+ tx1,177+ tx+ tx1,177+ tx+ tx1,170+ tx+ tx1};
int y[] = {432,422,422,432,432,442,442,445,445,442,442,445,445,442,442};
int n = 15;
g.fillPolygon(x,y,n);

//bord bas
g.setColor(Color.black);
g.drawLine(100,452,140,383);
g.drawLine(200,452,240,371);
g.drawLine(300,452,340,371);
g.drawLine(400,452,440,383);
g.drawLine(500,452,528,409);

g.setFont(f1);
g.setColor(Color.white);
g.drawString("Veuillez patienter SVP !",222,471);
	}


	private void initialize() {
	
		container = getContentPane();
		JPanel panel = new JPanel();
                setIconImage(new ImageIcon("icone.png").getImage());
		setSize(590,470);
                setLocationRelativeTo(null);
		setTitle("FunGraphs");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		etiquette = new JLabel();
		add(panel);
		setVisible(true);
		panel.setLayout(null);	
  

                
jLabel3 = new javax.swing.JLabel();
this.jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/img/soleil.png"))); // NOI18N
panel.add(jLabel3);
this.jLabel3.setBounds(12, 260, 560, 98);           

ImageIcon image = new ImageIcon(getClass().getResource("/javaapplication2/img/Capture2.png"));
setIconImage(image.getImage());
JLabel icone =new JLabel(image);
panel.add(icone);
jLabel1 = new javax.swing.JLabel();
this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/img/Capture3.png"))); // NOI18N
panel.add(jLabel1);
this.jLabel1.setBounds(50, 11, 458, 248);   




 }	
   @Override 
    public void actionPerformed(ActionEvent ae){
        
        tx = tx + 1;
if(tx == 440)
{
	setVisible(false);
        chrono.stop();
	Projet03 Projet03;
        Projet03 = new Projet03();
	Projet03.setVisible(true);
}

repaint();

   }   

 	public static void main(String args[])
	{
	Projet003 Projet003 = new Projet003();
	Projet003.setVisible(true);
   }

    private void setIconeImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}