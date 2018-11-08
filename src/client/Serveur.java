/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


/**
 *
 * @author TAUTU
 */
public class Serveur {
    private int id_serveur;
    private String prenom;
    
    public Serveur(int pId_serveur, String pPrenom ){
        id_serveur = pId_serveur;
        prenom = pPrenom;
        
    }
        private int getId_serveur(){
            return id_serveur;
        }
        
        public void setId_serveur(int pId_serveur){
           id_serveur = pId_serveur;
        }
        
         private String getPrenom(){
        return prenom;
    }
         
    // fonction setId_client
    public void setPrenom(String pPrenom){
        prenom = pPrenom;
    }
    
    public void affiche(){
        System.out.println("ID du serveur :" + id_serveur);
        System.out.println("prenom du serveur :" + prenom);
    }
        
}
    
