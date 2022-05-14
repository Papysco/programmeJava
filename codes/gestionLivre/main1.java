import java.util.Scanner;

public class main1{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Livre tabLivre[] = new Livre[10];
        int rep;
        int i = 0;

        //saisi
        do {
            Livre livrePoche = new Livre();
            System.out.println("");
            livrePoche.saisiLivre();
  
            tabLivre[i] = livrePoche;
            i++;
            System.out.print("Voulez vous un autre enrigistrement ? (1/0) : ");
            rep = sc.nextInt();
        }while((rep == 1) && (i < tabLivre.length));


        //affichage

        for (Livre livrePoche : tabLivre) {
            System.out.println("");
            livrePoche.affichage();
        }

        sc.close();
        
    }
}


