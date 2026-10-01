/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.ArrayList;

/**
 *
 * @author younes
 */
public class Magasin {
    
    private final ArrayList<Produit> produits;
    
    public Magasin() {
        this.produits = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        for (Produit p : this.produits) {
            System.out.println(p.getNom());
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit p : this.produits) {
            if (p.getNom().equals(nom)) {
                return p;
            }
        }
        return null;
    }
    
}
