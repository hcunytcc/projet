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
public class Barman {
    
    private int barmaid;
    private String nom;

    // Déclarer les constructeur
    public Barman(int Barmaid, String Nom) {

        this.barmaid = Barmaid;
        this.nom = Nom;
    }

// définir les get et les set
    private int getBarmaid() {
        return barmaid;
    }

    public void setBarmaid(int Barmaid) {
        barmaid = Barmaid;
    }

    private String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        nom = Nom;
    }

    public void affiche() {
        System.out.println("Id Barman : " + barmaid);
        System.out.println("Son nom : " + nom);
    }
}

