import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Eleve {
    
    private int id;
    private String prenom;
    private String nom;
    private Livre tabEmprunt[] = new Livre[2];
    
    Scanner scEleve = new Scanner(System.in);
    public Eleve() {
    }

    public Eleve(int id, String prenom, String nom, Livre[] tabEmprunt) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.tabEmprunt = tabEmprunt;
    }
    
    public Livre[] getTabEmprunt() {
        return tabEmprunt;
    }
    public void setTabEmprunt(Livre tabEmprunt[]) {
        this.tabEmprunt = tabEmprunt;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void saisiEleve(){
        int i = 0;
        int j = 0;

        System.out.println("");
        System.out.print("Entrer le ID                : ");setId(Integer.parseInt(scEleve.nextLine()));
        System.out.print("Entrer le prenom            : ");setPrenom(scEleve.nextLine());
        System.out.print("Entrer le nom               : ");setNom(scEleve.nextLine());
        //System.out.print("Combien de livre emprunte   : ");i = scEleve.nextInt();

            for (j = 0; j < 2; j++) {
                Livre livre = new Livre();
                this.tabEmprunt[j] = livre;
            }
    }

    public void afficherEleve(){
        System.out.println();
        System.out.println("Prenom      : " + getPrenom());
        System.out.println("Nom         : " + getNom());
        System.out.println("ID          : " + getId());
        System.out.println("Livres      : ");
        
        for (Livre tab : tabEmprunt) {
            System.out.println("");
            if (tab.getTitre() != null) {
                tab.affichage();
            }
            
        }

    }

    public void emprunterLivre(Livre tab[], Eleve tabEleve[] ,int id){
        boolean trouve = false;
        String titre;
        int isbn,j;
        Livre myLivre = new Livre();

        System.out.println("\t EMPRUNT ! \n");
        for(int i = 0; i < tabEleve.length; i++) {
            if (tabEleve[i].getId() == id) {
                trouve = true;
                System.out.print("Entrer le titre du livre : ");
                titre = scEleve.nextLine();
                System.out.print("Entrer l'ISBN du livre : ");
                isbn = scEleve.nextInt();

                for (Livre livre : tab) {
                    if (livre != null) {
                        if ((livre.getTitre().equals(titre)) && (livre.getISBN() == isbn)){
                            livre.setStatut('i');
                            myLivre = livre;
                        }
                    }

                }

                if (tabEleve[i].tabEmprunt[0].getTitre() == null){
                    tabEleve[i].tabEmprunt[0] = myLivre;
                    break;
                } else if (tabEleve[i].tabEmprunt[1].getTitre() == null) {
                    tabEleve[i].tabEmprunt[1] = myLivre;
                    break;
                }


            }
        }

        if(!trouve){
            System.out.println("Identifiant non trouve !");
        }
    }

    @Override
    public String toString() {
        return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + 
        prenom + ",tabEmprunt=" + Arrays.toString(tabEmprunt)+ "]";
    }

    
}

