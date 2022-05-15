
import java.util.Scanner;

public class Livre{

   protected String titre;
   protected String prenomAuteur;
   protected String nomAuteur;
   protected String categorie;
   protected String codeAlphaNumerique;
   protected int ISBN;
   protected char statut;

    

    public Livre(){
        this.titre = "";
        this.prenomAuteur = "";
        this.nomAuteur = "";
        this.categorie = "";
        this.ISBN = 0;
        this.statut = ' ';
        this.codeAlphaNumerique = "";
    }

    String getTitre(){return this.titre;}
    String getPrenomAuteur(){return this.prenomAuteur;}
    String getNomAuteur(){return this.nomAuteur;}
    String getCateorie(){return this.categorie;}
    int getISBN(){return this.ISBN;}
    String getCodeAlphaNulerique(){return this.codeAlphaNumerique;}
    char getStatut(){return this.statut;}
    
    void setTitre(String titre){this.titre = titre;}
    void setPrenomAuteur(String prenomAuteur){this.prenomAuteur = prenomAuteur;}
    void setNomAuteur(String nomAuteur){this.nomAuteur = nomAuteur;}
    void setCategorie(String categorie){this.categorie = categorie;}
    void setISBN(int isbn){this.ISBN = isbn;}
    void setCodeAlphaNumerique(String codeAlphaNumerique){this.codeAlphaNumerique = codeAlphaNumerique;}
    void setStatut(char caractere){this.statut = caractere;}

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
        setCodeAlphaNumerique(sc.nextLine());
        System.out.print("Entrer le statut du livre      : ");
        setStatut(sc.next().charAt(0));
        System.out.print("Entrer le ISBN                 : ");
        setISBN(sc.nextInt());
       // sc.close();
        
    }
    

    public void affichage() {
        System.out.println("Titre               : "+ getTitre());
        System.out.println("prenom auteur       : "+ getPrenomAuteur());
        System.out.println("nom auteur          : "+ getNomAuteur());
        System.out.println("categorie           : "+ getCateorie());
        System.out.println("code alphaNumerique : "+ getCodeAlphaNulerique());
        System.out.println("ISBN                : "+ getISBN());
        System.out.println("Statut              : "+ getStatut());
    }

    public  void rechercherLivreDispo(Livre tab[]){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].statut == 'd') {
                tab[i].affichage();
            }
        }
    }

    public void rechercheLivre(Livre tab[], String nomLivre){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].titre == nomLivre) {
                tab[i].affichage();
            }
        }
    }

}

