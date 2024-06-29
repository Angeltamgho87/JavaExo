import java.util.InputMismatchException;
import java.util.Scanner;

public class ChercheValeur {

    public static void main(String[] args) {
        float[] tableau = {4f, 5f, 10.2f,40.5f, 45f};
        float valeurEntree = 0;
        //obj scanner pour lire les entrées
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez entrer une valeur à rechercher dans le tableau: ");
        try {
            valeurEntree = scan.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("Erreur : vous devez entrer un nombre flottant");
        }finally {
            scan.close();
        }
        int position = chercherValeur(tableau, valeurEntree) + 1;

        System.out.println("Chercher une valeur dans un tableau et  afficher son indice ");
        System.out.println("Nous recherchons la valeur "+ valeurEntree);

        if (chercherValeur(tableau, valeurEntree) != -1){
            System.out.println("Felicitation! nous avons trouvé la valeur "+ valeurEntree);
            System.out.println("Elle se trouve à la position  "+ position +" du tableau");
            System.out.println("La valeur se trouve au moins "+chercherValeurs(tableau,valeurEntree)+" fois dans le tableau.");
        }else {
            System.out.println("Désolé nous n'avons pas trouvé cette valeur !");
        }
    }

    static  int chercherValeur(float[]tab, float value){
        int indice =-1;
       for(int i=0;i<tab.length;i++){
           if(tab[i]==value){
               indice=i;
           }

       }
        return indice;
    }

   static int chercherValeurs(float[] tab, float value){
    int nbreShow = 0;
    for(int i=0;i<tab.length;i++){
        if(tab[i]==value){
            nbreShow++;
        }
    }
    return nbreShow;
   }
}
