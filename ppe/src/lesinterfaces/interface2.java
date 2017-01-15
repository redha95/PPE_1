package lesinterfaces;

import java.awt.*;
import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class interface2 {
	 static JFrame cadre=new JFrame("Hotel");
	 static String text="";
	 public static void main(String[]args){
		 
		 
		 JPanel content=new JPanel();
         JPanel P2= new JPanel();
         JLabel choisir= new JLabel("           Veuillez choisir la catégorie de votre choix :" );
         JPanel P1 = new JPanel();
         
         choisir.setForeground(Color.blue);
         P2.add(choisir);
         choisir.setPreferredSize(new Dimension(317,60));
         
         
	      JButton reservation = new JButton ("Reservation");
	      JButton historique = new JButton ("Historique");
	      JButton chambre = new JButton ("Chambre");
	      JButton incident = new JButton ("Incident");
	      JButton parametres = new JButton ("Paramètres");
	      JButton retour = new JButton("Retour");

	      P1.add(reservation);
	      P1.add(historique);
	      P1.add(chambre);
	      P1.add(incident);
	      P1.add(parametres);
	      content.add(retour);
	       
	     //P1.setLayout(new GridLayout(5,2));
	      reservation.setPreferredSize(new Dimension(260,30));
	      historique.setPreferredSize(new Dimension(260,30));
	      chambre.setPreferredSize(new Dimension(260,30));
	      incident.setPreferredSize(new Dimension(260,30));
	      parametres.setPreferredSize(new Dimension(260,30));
	      
	    
	   
	      
	      
	      cadre.getContentPane().add(content,BorderLayout.SOUTH);
	      cadre.getContentPane().add(P1,BorderLayout.CENTER);
	      cadre.getContentPane().add(P2,BorderLayout.NORTH);
	      cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      cadre.setLocationRelativeTo(null);
          cadre.setVisible(true);
          cadre.setResizable(false);
          cadre.setSize(330,330);
}
}