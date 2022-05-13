import java.util.Scanner;

public class main1{
    public static void main(String[] args) {
    
        Livre livrePoche = new Livre();
        Scanner sc = new Scanner(System.in);

        //saisi
        System.out.println();
        System.out.print("Entrer le titre du livre                 : ");
        livrePoche.setTitre(sc.nextLine());
        System.out.print("Entrer le prenom de l'auteur             : ");
        livrePoche.setPrenomAuteur(sc.nextLine());
        System.out.print("Entrer le nom de l'auteur                : ");
        livrePoche.setNomAuteur(sc.nextLine());
        System.out.print("Entrer le categorie du livre             : ");
        livrePoche.setCategorie(sc.nextLine());
        System.out.print("Entrer le code alpha numerique du livre  : ");
        livrePoche.setCodeAlphaNumerique(sc.nextLine());
        System.out.print("Entrer l'ISBN du livre                   : ");
        livrePoche.setISBN(sc.nextInt());

        //affichage
        System.out.println("");
        System.out.println("Affichage !");
        System.out.println("Titre           : "+livrePoche.getTitre());
        System.out.println("Prenom          : "+livrePoche.getPrenomAuteur());
        System.out.println("Nom             : "+livrePoche.getNomAuteur());
        System.out.println("Categorie       : "+livrePoche.getCateorie());
        System.out.println("ISBN            : "+livrePoche.getISBN());
        System.out.println("Code alphanum   : "+livrePoche.getCodeAlphaNulerique());

        sc.close();

    }
}

