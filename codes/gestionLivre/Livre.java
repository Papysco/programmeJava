
import java.util.Scanner;

public class Livre{
    private String titre;
    private String prenomAuteur;
    private String nomAuteur;
    private String categorie;
    private String codeAlphaNumerique;
    private int ISBN;
    private char statut;

    public Livre(){
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
        System.out.println("Statut              : "+ getStatut());
        System.out.println("ISBN                : "+ getISBN());
    }

    public  void rechercherLivreDispo(Livre tab[]){
        System.out.println("Les livres disponibles : ");
        for (Livre livre : tab) {
            if (livre != null) {
                if (livre.statut == 'd'|| livre.statut == 'D') {
                    livre.affichage();
                    System.out.println();
                }
            }
        }
    }

    public void  rechercherLivreEmprunte(Livre tab[]){
        System.out.println("Les livres empruntés : ");
        for (Livre livre : tab) {
            if (livre != null) {
                if (livre.statut == 'i'|| livre.statut == 'I') {
                    System.out.println();
                    livre.affichage();
                }
            }
        }
    }

    
    public void rechercheLivre(Livre tab[], String nomLivre){
        for (Livre livre : tab) {
            if (livre != null) {
                if (livre.titre == nomLivre) {
                    livre.affichage();
                }
            }
        }
    }

   
}

