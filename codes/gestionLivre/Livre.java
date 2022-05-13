
import java.util.Scanner;

public class Livre{

    String titre;
    String prenomAuteur;
    String nomAuteur;
    String categorie;
    int ISBN;
    String codeAlphaNumerique;

    public Livre(){
        this.titre = "";
        this.prenomAuteur = "";
        this.nomAuteur = "";
        this.categorie = "";
        this.ISBN = 0;
        this.codeAlphaNumerique = "";
    }

    String getTitre(){return titre;}
    String getPrenomAuteur(){return prenomAuteur;}
    String getNomAuteur(){return nomAuteur;}
    String getCateorie(){return categorie;}
    int getISBN(){return ISBN;}
    String getCodeAlphaNulerique(){return titre;}
    
    void setTitre(String titre){this.titre = titre;};
    void setPrenomAuteur(String prenomAuteur){this.prenomAuteur = prenomAuteur;}
    void setNomAuteur(String nomAuteur){this.prenomAuteur = nomAuteur;}
    void setCategorie(String prenomAuteur){this.prenomAuteur = prenomAuteur;}
    void setISBN(int isbn){this.ISBN = isbn;}
    void setCodeAlphaNumerique(String codeAlphaNumerique){this.codeAlphaNumerique = codeAlphaNumerique;}

    public void saisiLivre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le titre du livre : ");
        titre = sc.nextLine();
        System.out.println("Entrer le prenom de l'auteur : ");
        prenomAuteur = sc.nextLine();
        System.out.println("Entrer le nom de l'auteur: ");
        nomAuteur = sc.nextLine();
        System.out.println("Entrer la categorie : ");
        categorie = sc.nextLine();
        System.out.println("Entrer le ISBN : ");
        ISBN = sc.nextInt();
        System.out.println("Entrer le code Alphanumerique : ");
        nomAuteur = sc.nextLine();
    }

  /*  public void affichage(Livre livre) {
        System.out.println("");
        System.out.println("titre : "+);
    }
    */


}

