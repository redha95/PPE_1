/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class Carte {
    
    
    private String couleur;
    private int valeur;
    
    /////////
    
    ArrayList<Carte> cartes = new ArrayList();
    
  //  for(){

    //}
    
    //////////

    public Carte(String couleur,int valeur) {
        
        this.couleur = couleur;
        this.valeur = valeur;
    }
    
    public void accesseurs(){for(=0,i<32,i++){

    }
            }
    
    public void modificateurs (){
            }
    
    public void	comparateur(){
           }

    
    public String toString() {
        return "La carte est de couleur " + couleur + ", son numéro est " + valeur;
    }
    
    
}
