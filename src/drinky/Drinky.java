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
public class Drinky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Client fiche_client = new Client(69, "Laura la chaudasse!!!");
        fiche_client.affiche();
        Barman new_barmaid = new Barman (69,"Isabella");
        new_barmaid.affiche();
        Commande Bon = new Commande (007,"Laura", "la p*** elle en aura pour tant = ???");
        Bon.affiche();
        Serveur testicule = new Serveur (524, "Jessie");
        testicule.affiche();
        
        
    }
    
}
    
    

