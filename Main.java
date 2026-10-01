/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionMagasin;
import java.util.Scanner;


/**
 *
 * @author younes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // on créé client
        Client client = new Client(1, "Younes", "younes@mail.com");

        // Création du magasin et des produits
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, 29.99, "Clavier", 10));
        magasin.ajouterProduit(new Produit(2, 15.50, "Souris", 20));
        magasin.ajouterProduit(new Produit(3, 149.99, "Ecran", 5));
        magasin.ajouterProduit(new Produit(4, 599.99, "PS5", 10));

        Panier panier = new Panier();
        int choix;
        
        do {
            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter" + "\n");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\n" +"Voici les produits disponibles : " + "\n");
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit : ");
                    String nom = sc.nextLine();
                    Produit p = magasin.trouverProduitParNom(nom);
                    if (p == null) {
                        System.out.println("Produit introuvable.");
                    } else {
                        System.out.print("Quantité : ");
                        int qte = sc.nextInt();
                        sc.nextLine();
                        panier.ajouterProduit(new Produit(p.getId(), p.getPrix(), p.getNom(), qte));

                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    break;

                case 4:
                    // on recupere la commande du client 1
                    Commande commande = new Commande(1, client, panier);
                    commande.afficherDetailsCommande();
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 5);

        sc.close();
    }
    
}
