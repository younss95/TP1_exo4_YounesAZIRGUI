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
public class Commande {
    
    private final int idCommande;
    private final Client client;
    private final ArrayList<Produit> produitsCommandes;
    private final double total;
    
    public Commande(int idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = panier.getProduits();
        this.total = panier.calculerTotal();
    }
    
    
    public void afficherDetailsCommande() {
        System.out.println("Commande n°" + this.idCommande);
        System.out.println("Client : " + this.client.getNom());
        for (Produit p : this.produitsCommandes) {
            System.out.println("Produit : " + p.getNom());
        }
        System.out.println("Total : " + this.total + " €");
    }
    
    
    
}
