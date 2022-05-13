
import java.util.Scanner;

public class Livre{

   private String titre;
   private String prenomAuteur;
   private String nomAuteur;
   private String categorie;
   private int ISBN;
   private String codeAlphaNumerique;

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
    String getCodeAlphaNulerique(){return codeAlphaNumerique;}
    
    void setTitre(String titre){this.titre = titre;}
    void setPrenomAuteur(String prenomAuteur){this.prenomAuteur = prenomAuteur;}
    void setNomAuteur(String nomAuteur){this.nomAuteur = nomAuteur;}
    void setCategorie(String categorie){this.categorie = categorie;}
    void setISBN(int isbn){this.ISBN = isbn;}
    void setCodeAlphaNumerique(String codeAlphaNumerique){this.codeAlphaNumerique = codeAlphaNumerique;}

    public void saisiLivre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le titre du livre       : ");
        titre = sc.nextLine();
        System.out.println("Entrer le prenom de l'auteur   : ");
        prenomAuteur = sc.nextLine();
        System.out.println("Entrer le nom de l'auteur      : ");
        nomAuteur = sc.nextLine();
        System.out.println("Entrer la categorie            : ");
        categorie = sc.nextLine();
        System.out.println("Entrer le ISBN                 : ");
        ISBN = sc.nextInt();
        System.out.println("Entrer le code Alphanumerique  : ");
        nomAuteur = sc.nextLine();

        sc.close();
    }

  /*  public void affichage(Livre livre) {
        System.out.println("");
        System.out.println("titre : "+);
    }
    */


}

