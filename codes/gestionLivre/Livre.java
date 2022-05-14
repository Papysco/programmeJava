
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

    Scanner sc = new Scanner(System.in);
    public void saisiLivre(){
        

        System.out.print("Entrer le titre du livre       : ");
        setTitre(sc.nextLine());
        System.out.print("Entrer le prenom de l'auteur   : ");
        setPrenomAuteur(sc.nextLine());
        System.out.print("Entrer le nom de l'auteur      : ");
        setNomAuteur(sc.nextLine());
        System.out.print("Entrer la categorie            : ");
        setCategorie(sc.nextLine());
        
        System.out.print("Entrer le code Alphanumerique  : ");
        setCategorie(sc.nextLine());
        System.out.print("Entrer le ISBN                 : ");
        setISBN(sc.nextInt());
       // sc.close();
        
    }
    

    public void affichage() {
        System.out.println("");
        System.out.println("titre               : "+ getTitre());
        System.out.println("prenom auteur       : "+ getPrenomAuteur());
        System.out.println("nom auteur          : "+ getNomAuteur());
        System.out.println("categorie           : "+ getCateorie());
        System.out.println("code alphaNumerique : "+ getCodeAlphaNulerique());
        System.out.println("ISBN                : "+ getISBN());
    }




}

