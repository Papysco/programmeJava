import java.util.Scanner;

//import java.io.InputStreamReader;

public class main1{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    
        Livre tabLivre[] = new Livre[10];
        Eleve student[] = new Eleve[10];
        Livre livre = new Livre();
        String nom = new String();
        int choix;


        do {
            System.out.println();
            System.out.println("*************************");
            System.out.println("\t MENU");
            System.out.println("*************************");
            System.out.println();
            System.out.println("1.SAISIR LE TABLEAU LES LIVRES ");
            System.out.println("2.SAISIR LA LISTE DES ELEVES   ");
            System.out.println("3.AFFICHER LES LIVRES          ");
            System.out.println("4.AFFICHER LES ELEVES ");
            System.out.println("5.AFFICHER LA LISTE DES LIVRES DISPONIBLES ");
            System.out.println("6.AFFICHER LES LIVRES EMPRUNTES ");
            System.out.println("7.RECHERCHER UN LIVRE ");
            System.out.println("8.RETORNER UN LIVRE ");
            System.out.println("0.QUITTER ");
            System.out.print("Veuillez entrer votre choix : ");
            choix =  sc.nextInt();
            //choix = Integer.parseInt(scMenu.nextLine());

            switch (choix) {
                case 1: saisi(tabLivre);
                    break;
                case 2: saisirEleve(student);
                    break;
                case 3: affichage(tabLivre);
                    break;
                case 4: afficherEleve(student);
                    break;
                case 5: livre.rechercherLivreDispo(tabLivre);
                    break;
                case 6: livre.rechercherLivreEmprunte(tabLivre);
                    break;
                case 7: 
                    System.out.print("Entrer le nom du livre : "); 
                    nom = sc.nextLine();
                    livre.rechercheLivre(tabLivre, nom);
                    break;
                case 0: System.out.println("bye!");
                    break;
            }
            

        }while(choix != 0);
        
    }
    
    //saisi livre
    public static void saisi(Livre tabLivre[]){
        char rep;
        int i  = 0;
        
        do {
            Livre livrePoche = new Livre();
            System.out.println("");
            livrePoche.saisiLivre();
  
            tabLivre[i] = livrePoche;
            i++;
            System.out.print("Voulez vous un autre enrigistrement ? (o/n) : ");
            rep = sc.next().charAt(0);
        }while((rep == 'o' || rep == 'O') && (i < tabLivre.length));

    }

    //affichage livre;
  
    public static void affichage(Livre[] tabLivre) { 
        
            System.out.println("\t Affichage");
    
            for (Livre livre : tabLivre) {
                if (livre != null) {
                    livre.affichage();
                }
                
            }
    }
  
        
    //saisir des eleves
    public static void saisirEleve(Eleve student[]){
        char rep;
        int i  = 0;
        //Scanner sc = new Scanner(System.in);

        do {
            Eleve eleve = new Eleve();
            System.out.println("");
            eleve.saisiEleve();
  
            student[i] = eleve;
            i++;
            System.out.print("Voulez vous un autre enrigistrement ? (O/n) : ");
            rep = sc.next().charAt(0);
        }while((rep == 'o' || rep == 'O') && (i < student.length));

        //sc.close();
    }


    //affichage eleves;
    public static void afficherEleve(Eleve student[]){
        
        System.out.println("\t Affichage Eleves");
    
        for (Eleve eleve : student) {
            if (eleve != null) {
                eleve.afficherEleve();
            }   
            
        }
    }


/*
    public void retournerLivre(Livre tab[], Eleve tabEleve[] ,int id){
        System.out.print("voici les livres empruntes : ");
        Livre tableau[] = new Livre[2];

        for (int i = 0; i < tabEleve.length; i++) {
            if (tabEleve[i].getId() == id) {
            
                tableau = tabEleve[i].getTabEmprunt();
                for (int j = 0; j < tableau.length; j++) {
                    System.out.println(tableau[j].getTitre());
                }
                
            }
        }
    }
*/
}






