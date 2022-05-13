
import java.util.Scanner;


public class main1{

    public static void main(String[] args) {
    
        Livre livrePoche = new Livre();
        Scanner sc = new Scanner(System.in);
        String chaine;

        //saisi
        System.out.println();
        System.out.println("Entrer le titre du livre : ");
        chaine = sc.nextLine(); livrePoche.setTitre(chaine);
        System.out.println("Entrer le prenom de l'auteur : ");
        chaine = sc.nextLine(); livrePoche.setPrenomAuteur(chaine);
        System.out.println("Entrer le nom de l'auteur : ");
        chaine = sc.nextLine(); livrePoche.setNomAuteur(chaine);
        System.out.println("Entrer le categorie du livre : ");
        livrePoche.setNomAuteur(sc.nextLine());
        System.out.println("Entrer l'ISBN du livre : ");
        livrePoche.setISBN(sc.nextInt());
        System.out.println("Entrer le code alpha numerique du livre : ");
        livrePoche.setCodeAlphaNumerique(sc.nextLine());

        //affichage

    }
}

