package lesinterfaces;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.xml.soap.Text;

public class interface1 {

    
    
    static JPanel clavier = new JPanel();
    static JPanel content = new JPanel();
    static JLabel label = new JLabel();
    static JFrame cadre = new JFrame("Hotels");
    
    
    public static void main(String[] args) {
        
        
        
        JButton entrer = new JButton("Entrer");
        content.add(entrer);
        JButton reni = new JButton("Réinitialiser");
        content.add(reni);
        
        JLabel bienvenue = new JLabel("Bienvenue sur l'interface");
        clavier.add(bienvenue);       
        JLabel bienvenue2 = new JLabel("       de la Societé Hotels         ");
        clavier.add(bienvenue2);      
        JLabel ident = new JLabel("Identifiant");
        clavier.add(ident);       
        JTextField identifiant = new JTextField();
        clavier.add(identifiant);       
        JLabel mdp = new JLabel("Mot de passe");
        clavier.add(mdp);        
        JPasswordField motdepasse = new JPasswordField();
        clavier.add(motdepasse);
        
        
        
        
        
        
        
        ident.setForeground(Color.blue);
        mdp.setForeground(Color.blue);
        identifiant.setPreferredSize(new Dimension(200, 25));
        motdepasse.setPreferredSize(new Dimension(200, 25));
    
        cadre.setLocationRelativeTo(null);
        cadre.setSize(230, 300);
        cadre.setLayout(new BorderLayout());
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setResizable(false);
        cadre.getContentPane().add(content,BorderLayout.SOUTH);
        cadre.getContentPane().add(clavier,BorderLayout.CENTER);
        cadre.setVisible(true);


        
    }

}