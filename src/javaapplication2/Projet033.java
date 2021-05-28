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
public class Projet033 extends JFrame implements ActionListener {

    Container container;
    private JLabel jLabel1;
    private JLabel etiquette;
    private JLabel etiquette2;
    private JComboBox jcb;
    private JTextField champTexte1;
    private JPasswordField champTexte2;
    private JButton bouton1;
    private JButton bouton2;
    private JButton bouton3;
    String rec;
    String rec2;
    String rep;
    String rep2;
    Font f = new Font("Verdana", Font.BOLD + Font.ITALIC, 25);
    Font f1 = new Font("Calibri", Font.ITALIC, 19);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString("Connection", 195, 74);
        g.setFont(f1);
        g.drawString("Identifiant:", 222, 115);
        g.drawString("Mots de Passe:", 195, 139);
    }

    public Projet033() {
        super("FunGraphs");
        initialize();
    }

    private void initialize() {

        container = getContentPane();
        JPanel panel = new JPanel();
        setSize(480, 250);
        setLocationRelativeTo(null);
        setTitle("FunGraphs");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        etiquette = new JLabel();
        add(panel);
        setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.green);

        ImageIcon image = new ImageIcon(getClass().getResource("/javaapplication2/img/Capture2.png"));
        setIconImage(image.getImage());
        JLabel icone = new JLabel(image);
        panel.add(icone);

        bouton1 = new JButton();
        this.bouton1.setText("Continuer");
        this.bouton1.setBounds(308, 124, 90, 30);
        panel.add(bouton1);
        this.bouton1.addActionListener(this);

        bouton2 = new JButton();
        this.bouton2.setText("Aide");
        this.bouton2.setBounds(405, 124, 60, 30);
        panel.add(bouton2);
        this.bouton2.addActionListener(this);

        jLabel1 = new javax.swing.JLabel();
        this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/img/Capture4.png"))); // NOI18N
        panel.add(jLabel1);
        this.jLabel1.setBounds(0, 0, 478, 248);

        champTexte1 = new JTextField();
        this.champTexte1.setBounds(308, 70, 157, 20);
        panel.add(champTexte1);
        this.champTexte1.addActionListener(this);

        champTexte2 = new JPasswordField("");
        this.champTexte2.setBounds(308, 97, 157, 20);
        panel.add(champTexte2);
        this.champTexte2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.bouton2) {
            JOptionPane.showMessageDialog(null, "Par defaut le login est:  groupemnm  et le mots de passes est  mnm");
        }
        if (ae.getSource() == this.bouton1) {
            rec = this.champTexte1.getText();
            rec2 = this.champTexte2.getText();
            rep = "groupemnm";
            rep2 = "mnm";

            if (rec.equals(rep) && rec2.equals(rep2)) {
                setVisible(false);
                Projet3 Projet3 = new Projet3();
                Projet3.setVisible(true);

                JOptionPane.showMessageDialog(null, "        votre Identifiant est: " + rec + " veuillez ne pas oublier votre Mots de Passe! Merci :)");
            } else {
                JOptionPane.showMessageDialog(null, "  Login ou mots de passe incorect ");
            }
        }
    }

}
