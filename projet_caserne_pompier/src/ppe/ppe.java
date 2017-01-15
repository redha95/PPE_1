package ppe;
import java.sql.*;
import java.sql.Timestamp;
import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class ppe {

    private static String dbURL="jdbc:derby:/tmp/Elie;create = true;user=derby; password=derby";
    private static Connection conn=null;
    private static Statement stmt=null;
    public static void main(String[] args) {
   
             
    	 try{
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
             System.out.println("Driver Loaded");
             conn=DriverManager.getConnection(dbURL);
             System.out.println("Connected");
         }
         catch (Exception except)
         {
             except.printStackTrace();
         }

        Scanner sc = new Scanner (System.in);
        int nombreBlesses, i=1, j=1, k;
        int menu=0, menuSpecialiste=0, natureIntervention=0, menuQualif=0, idSpecialiste, historique;
        String nomSpecialiste, prenomSpecialiste, qualification, lieuIntervention;
        java.util.Date date= new java.util.Date();
   	 	System.out.println(new Timestamp(date.getTime()));
   	 	java.sql.Date sqlDate = new java.sql.Date(date.getTime());
   	 	String dateInt = sqlDate.toString();
        
        while(j==1){
        System.out.println("Bonjour monsieur le responsable.");
        System.out.println("Bienvenue sur le programme d'affectation des sp�cialistes au sein des �quipes de pompiers de Courbevoie.");
           
        System.out.println("Tapez sur 1 pour enregistrer une nouvelle intervention.");
        System.out.println("Tapez sur 2 pour acc�der � l'historique des interventions");
        System.out.println("Tapez sur 3 pour acc�der au menu de gestion des sp�cialistes.");
        System.out.println("Tapez sur 4 pour acc�der au menu de gestion des qualifications.");
        
        //---------------------------------------CREATION D'INTERVENTION-----------------------------------------------
       
        menu=sc.nextInt();
        switch (menu){
        case 1:  
            System.out.println("Vous �tes sur le menu de cr�ation d'intervention");
            System.out.println("Veuillez pr�ciser la nature de l'accident s'il vous plait.");
            System.out.println("Tapez 1 pour INCENDIE, 2 pour ACCIDENT DE LA ROUTE, 3 pour FUSILLADE et 4 pour SAUVETAGE.");
            natureIntervention=sc.nextInt();
            switch (natureIntervention){
            case 1:
            	System.out.println("Pr�cisez le lieu s'il vous plait.");
            	sc.nextLine();
            	lieuIntervention=sc.nextLine();
            	lieuIntervention=lieuIntervention.toUpperCase();
                System.out.println("Y'a-t-il un ou plusieurs bless�s ?");
                nombreBlesses=sc.nextInt();
                sc.nextLine();
                System.out.println("Choisissez l'id du sp�cialiste � d�ployer");
                try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM specialiste");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                idSpecialiste=sc.nextInt();
                sc.nextLine();
                
                try {
                    stmt = conn.createStatement();
                    stmt.execute("Insert into intervention(date_intervention, type_intervention, nombre_blesses, lieu_intervention, id_specialiste) values ('"+dateInt+"', 'INCENDIE', "+nombreBlesses+", '"+lieuIntervention+"', "+idSpecialiste+")"); 
                    stmt.close();
                   
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                break;
            case 2:
            	System.out.println("Pr�cisez le lieu s'il vous plait.");
            	sc.nextLine();
            	lieuIntervention=sc.nextLine();
            	lieuIntervention=lieuIntervention.toUpperCase();
                System.out.println("Y'a-t-il un ou plusieurs bless�s ?");
                nombreBlesses=sc.nextInt();
                sc.nextLine();
                System.out.println("Choisissez l'id du ou des sp�cialiste(s) � d�ployer");
                try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM specialiste");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                idSpecialiste=sc.nextInt();
                sc.nextLine();
                
                try {
                    stmt = conn.createStatement();
                    stmt.execute("Insert into intervention(date_intervention, type_intervention, nombre_blesses, lieu_intervention, id_specialiste) values ('"+dateInt+"', 'ACCIDENT DE LA ROUTE', "+nombreBlesses+", '"+lieuIntervention+"', "+idSpecialiste+")"); 
                    stmt.close();
                   
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                break;
            case 3:
            	System.out.println("Pr�cisez le lieu s'il vous plait.");
            	sc.nextLine();
            	lieuIntervention=sc.nextLine();
            	lieuIntervention=lieuIntervention.toUpperCase();
                System.out.println("Y'a-t-il un ou plusieurs bless�s ?");
                nombreBlesses=sc.nextInt();
                sc.nextLine();
                System.out.println("Choisissez l'id du ou des sp�cialiste(s) � d�ployer");
                try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM specialiste");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                idSpecialiste=sc.nextInt();
                sc.nextLine();
                
                try {
                    stmt = conn.createStatement();
                    stmt.execute("Insert into intervention(date_intervention, type_intervention, nombre_blesses, lieu_intervention, id_specialiste) values ('"+dateInt+"', 'FUSILLADE', "+nombreBlesses+", '"+lieuIntervention+"', "+idSpecialiste+")"); 
                    stmt.close();
                   
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                break;
            case 4:
            	System.out.println("Pr�cisez le lieu s'il vous plait.");
            	sc.nextLine();
            	lieuIntervention=sc.nextLine();
            	lieuIntervention=lieuIntervention.toUpperCase();
                System.out.println("Y'a-t-il un ou plusieurs bless�s ?");
                nombreBlesses=sc.nextInt();
                sc.nextLine();
                System.out.println("Choisissez l'id du ou des sp�cialiste(s) � d�ployer");
                try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM specialiste");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                idSpecialiste=sc.nextInt();
                sc.nextLine();
                
                try {
                    stmt = conn.createStatement();
                    stmt.execute("Insert into intervention(date_intervention, type_intervention, nombre_blesses, lieu_intervention, id_specialiste) values ('"+dateInt+"', 'SAUVETAGE', "+nombreBlesses+", '"+lieuIntervention+"', "+idSpecialiste+")"); 
                    stmt.close();
                   
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
                break;
            default:
                System.out.println("Choisissez un nombre entre 1 et 4.");
                break;
               
            }
            break;
           
          //---------------------------------------HISTORIQUE INTERVENTIONS-----------------------------------------------
           
           
        case 2:
            System.out.println("Vous �tes sur l'historique des interventions. Tapez 1 pour afficher l'historique et 0 pour l'effacer.");
            historique=sc.nextInt();
            if(historique==1){
            try {
                Statement state = conn.createStatement();
                ResultSet result = state.executeQuery("SELECT * FROM intervention");
                ResultSetMetaData resultMeta = result.getMetaData();
                System.out.println("\n**********************************");
                for(k = 1; k <= resultMeta.getColumnCount(); k++)
                  System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                   
                System.out.println("\n**********************************");
                   
                while(result.next()){         
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                  	  if (result.getObject(k)!=null){
                            System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                              
                          System.out.println("\n---------------------------------");
                  }

                result.close();
                state.close();
            }
            catch (SQLException sqlexception)
            {
                sqlexception.printStackTrace();
            }
            }
            else if(historique==0){
            	try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("DELETE * FROM intervention");
            }
            	catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
            }
            break;
           
          //---------------------------------------MENU SPECIALISTES-----------------------------------------------
           
           
        case 3:
            System.out.println("Bienvenue sur le menu de gestion des sp�cialistes");
            System.out.println("Pour ajouter un nouveau sp�cialiste, appuyez sur 1");
            System.out.println("Pour afficher la liste des sp�cialistes d�j� existants, appuyez sur 2");
            System.out.println("Pour modifier/supprimer la fiche d'un sp�cialiste, appuyez sur 3");
            menuSpecialiste=sc.nextInt();
            switch (menuSpecialiste) {
            case 1:
                System.out.println("Bienvenue sur le menu d'ajout de sp�cialiste.");
                System.out.println("Entrez le nom du sp�cialiste.");
                nomSpecialiste=sc.next();
                nomSpecialiste=nomSpecialiste.toUpperCase();
                System.out.println("Entrez le pr�nom du sp�cialiste.");
                prenomSpecialiste=sc.next();
                prenomSpecialiste=prenomSpecialiste.toUpperCase();
                System.out.println("Entrez les qualifications du sp�cialiste.");
                qualification=sc.next();
                qualification=qualification.toUpperCase();
                    try {
                        stmt = conn.createStatement();
                        stmt.execute("Insert into specialiste(nom_specialiste, prenom_specialiste, qualification_specialiste) values ('"+nomSpecialiste+"', '"+prenomSpecialiste+"', '"+qualification+"')"); 
                        stmt.close();
                       
                    }
                    catch (SQLException sqlexception)
                    {
                        sqlexception.printStackTrace();
                    }
               
            break;
            case 2:
                System.out.println("Bienvenue sur le menu affichant la liste des sp�cialistes d�j� existants.");
                try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM specialiste");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
            break;
            case 3:
                System.out.println("Vous pouvez ici modifier la fiche d'un sp�cialiste d�j� existant.");
                //Modification table SQL 
            break;
            default :
                System.out.println("Retour au menu pr�c�dent.");
                break;
            }
        break;
        case 4 :
        	//----------------------------------MENU QUALIFICATIONS----------------------------------------
        	
        	System.out.println("Bienvenue sur le menu d�di� aux qualifications.");
        	System.out.println("Tapez sur 1 pour entrer une nouvelle qualification.");
        	System.out.println("Tapez sur 2 pour afficher la liste des qualifications d�j� existantes.");
        	System.out.println("Tapez sur 3 pour modifier la liste des qualifications.");
        	menuQualif=sc.nextInt();
        	switch(menuQualif){
        	case 1:
        		System.out.println("Menu de cr�ation de qualification.");
        		System.out.println("Veuillez entrer la nouvelle qualification.");
        		qualification=sc.next();
        		qualification=qualification.toUpperCase();
        		try {
                    stmt = conn.createStatement();
                    stmt.execute("Insert into qualification(qualification_specialiste) values ('"+qualification+"')"); 
                    stmt.close();
                   
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
        		break;
        	case 2:
        		System.out.println("Affichage des qualifications d�j� existantes.");
        		try {
                    Statement state = conn.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM qualification");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    System.out.println("\n**********************************");
                    for(k = 1; k <= resultMeta.getColumnCount(); k++)
                      System.out.print("\t" + resultMeta.getColumnName(k).toUpperCase() + "\t *"); 
                       
                    System.out.println("\n**********************************");
                       
                    while(result.next()){         
                      for(k = 1; k <= resultMeta.getColumnCount(); k++)
                    	  if (result.getObject(k)!=null){
                              System.out.print("\t" + result.getObject(k).toString() + "\t |");}
                                
                            System.out.println("\n---------------------------------");
                    }

                    result.close();
                    state.close();
                }
                catch (SQLException sqlexception)
                {
                    sqlexception.printStackTrace();
                }
        		break;
        	case 3:
        		System.out.println("Menu de modification de la liste des qualifications.");
        		break;
        		default :
        			System.out.println("Retour au menu principal");
        		break;
        	}
        	break;
        default :
        System.out.println("Menu principal.");
        break;
        }
        System.out.println("Relancer le programme ?");
        System.out.println("Tapez 1 pour oui et 0 pour non.");
        j=sc.nextInt();
        }
       
        try {
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn=DriverManager.getConnection(dbURL+";shutdown=true");
                conn.close();
            }
           
        }
        catch (SQLException sqlexcept)
        {
    
   
        }
    }
   
}
