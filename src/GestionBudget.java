public class GestionBudget {
    public static void main(String[] args) {

        double[][] tableau = initBudget();
        System.out.println("Gestion du budget");
        afficherMois(tableau, 2023);
        afficherAnnee(tableau, 2);
        meilleurEpargne(tableau);
        System.out.println("L'épargne total est de : " + epargneTotale(tableau));
    }


    //initialisation valeur tableau
    public static double[][] initBudget(){
        return new double[][]{
                {0, 500, 100, 400, 20, 450, 800, 190, 225, 250, 560, 0},      // 2023
                {100, 300, 0, 0, 0, 240, 1000, 650, 0, 750, 140, 90},          // 2022
                {890, 0, 100, 700, 0, 0, 0, 0, 600, 2000, 0, 0},               // 2021
                {450, 380, 750, 0, 850, 0, 70, 1000, 0, 560, 900, 700}         // 2020
        };

    }


    //afficher les epargnes d'une année donnée
    public static void afficherMois(double[][]tab, int annee  ){


        if(annee >=2000 && annee <=2023){
            System.out.println("Voici les épargnes de l'année  : "+annee);
            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab[i].length; j++){

                    if(annee(i)==annee){
                        System.out.print(tab[i][j]+" | ");
                    }
                }
            }
            System.out.println();
        }else {
            System.out.println("Année invalide");
        }
    }

    //afficher les épargne d'un mois donné
    public static void afficherAnnee(double[][] tab, int mois ){


        if(mois>=1 && mois<=12){
            System.out.println("Voici les épargnes du mois de : " + nomMois(mois-1));
            for(int i=0; i<tab.length; i++){
                for(int j=0; j<tab[i].length; j++){
                    if(j==mois-1){

                        System.out.print(tab[i][mois-1]+" | ");
                    }

                }

            }
            System.out.println();
        }else{
            System.out.println("Mois invalide");
        }

    }


    //afficher l'année et le mois de la meilleur epargne
    public static void meilleurEpargne(double[][] tab){
        double meilleurEpargne = 0;
        int moisIndex = 0;
        int anneeIndex = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if (tab[i][j]>meilleurEpargne){
                    meilleurEpargne = tab[i][j];
                    moisIndex =j;
                    anneeIndex = i;

                }
            }
        }
        System.out.println("La meilleur Epargne se trouve à l'année : "+annee(anneeIndex) +" au cours du mois de : " + nomMois(moisIndex));
    }

    //retourn l'epargne totale
    public  static  double epargneTotale(double[][] tab){
        double epargneTotale = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){

                epargneTotale += + tab[i][j];
            }
        }
        return epargneTotale;
    }
    //nom du mois retourné par rapport à l'index
    public static String nomMois(int index){
        String[]lesMois = {"Jan", "Fev","Mars", "Avr", "Mai", "Juin", "Juil", "Aout","Sept","Oct","Nov","Dec"};
        return lesMois[index];
    }

    //année retourné par rapport à l'index
    public  static int annee (int index){
        int[]annees = {2023, 2022, 2021, 2020, 2019} ;

        return annees[index];
    }


}
