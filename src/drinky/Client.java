/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinky;

/**
 *
 * @author TAUTU
 */
public class Client {
    
    private int id_client;
    private String prenom;
    
    public Client (int pId_client, String pPrenom){
        id_client = pId_client;
        prenom = pPrenom;
    }
    
    private int getId_client(){
        return id_client;
    }
    
    public void setId_client(int pId_client){
        id_client = pId_client;
    }
    
        private String getPrenom(){
           return prenom; 
        }
        
        public void setPrenom(String pPrenom){
            prenom = pPrenom;
        }
        
        public void affiche() {
            System.out.println("Le numéro du client est : " + id_client);
            System.out.println("et le prénom du client est : "+ prenom);
        }
    
}
    

