/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Date;

/**
 *
 * @author TAUTU
 */
public class Commande {

    //Déclarer les variables
    private int id_cde;
    private String total_ttc;
    private String id;
   // private String id_serveur;  
    
    //Méthode renseigner la classe commande
    // Ajouter le String serveur si besoin avec : String pId_serveur
    
    public Commande(int pId_cde, String pId, String pTotal_ttc){
        id_cde = pId_cde;
        id = pId;
        total_ttc = pTotal_ttc;
        
    //    id_serveur = pId_serveur;
    }
    
    /*
    Définistion des getteur et setteur
    */
    
    //fonction GetId_cde
    private int getId_cde(){
        return id_cde;
    }
    //fonction SetId_cde
    public void setId_cde(int pId_cde){
        id_cde = pId_cde;
    }
    
        // fonction getid_client
    private String getId(){
        return id;
    }
    // fonction setId_client
    public void setId_client(String pId){
        id = pId;
    }
    
    
    //fonction Gettotal_cde
    private String getTotal_ttc(){
        return total_ttc;
    }
    // fonction setTotal_cde
    public void setTotal_ttc(String pTotal_ttc){
        total_ttc = pTotal_ttc;
    }
    
    
    
    /* Ajouter le serveur si besoin
    
    //fonction Getid_serveur
    private String getId_serveur(){
        return id_serveur;
    }
    // fonction setId_serveur
    public void setId_serveur(String pId_serveur){
        id_serveur = pId_serveur;
    }
    */
    
    // Définition d'un classe affiche
    public void affiche() {
        
        System.out.println("N°Commande : " + id_cde);
        System.out.println("Client : "+ id);        
        System.out.println("Total : "+ total_ttc +"XPF");
        Date aujourdhui = new Date(); 
        System.out.println(aujourdhui);

       // System.out.println("Serveur : "+ id_serveur);
        
    }
  
}
