/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author younes
 */
public class Produit {
    
    private int id;
    private double prix;
    private String nom;
    private int quantite;
    
    
    public Produit(int id, double prix, String nom, int quantite){
        this.id = id;
        this.prix = prix;
        this.nom = nom;
        this.quantite = quantite;
                
    }
    
    
    
   // Getters
    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getQuantite() {
        return this.quantite;
    }
    

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
    // Affichage
    public void afficherDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Nom: " + this.nom);
        System.out.println("Prix: " + this.prix + " €");
        System.out.println("Quantité: " + this.quantite);
    }
    
    
    
    
    
}
