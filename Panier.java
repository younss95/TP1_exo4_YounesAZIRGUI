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
public class Panier {
    
    private final ArrayList<Produit> produits;
    
    public Panier(){
        this.produits = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit){
         produits.add(produit);
        
    }
    
    public void supprimerProduit(Produit produit){
        produits.remove(produit);
        
    }
    
    public void afficherPanier(){
        for(Produit p : produits){
            System.out.println(p.getNom());
        }
        
        
    }
    
    public double calculerTotal(){
      double total = 0;
        for (Produit p : this.produits) {
            total += p.getPrix() * p.getQuantite();
        }
        return total;
        
    }
    
    
    // Getter
    public ArrayList<Produit> getProduits() {
        return this.produits;
    }
    
}
