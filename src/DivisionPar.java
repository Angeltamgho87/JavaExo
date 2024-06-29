public class DivisionPar {

    public static void main(String[] args) {
        int[]   tableau = {12, 27, 1, 34, 51, 22, 9};
    //Calculer et afficher le nombre n entier impair du tableau

        int nbrImpair = 0;
        for(int el:tableau){
            if (!divisiblePar(el,2)){
                nbrImpair++;
            }
        }
        System.out.println("Le tableau contien "+  nbrImpair +" nombres impair");

    //nbre de multiple de nbreImpair
       System.out.println("Le nombre de multiple de "+nbrImpair+" dans le tableau est : "+multiplesDe(tableau,nbrImpair));
    }
    public  static boolean divisiblePar(int x, int y) throws ArithmeticException {

        if(x%y==0){
            return true;
        }else {
            return false;
        }

    }

    public  static int multiplesDe(int[]t, int e){
        int cpt = 0;
        for(int el : t){
            if(divisiblePar(el, e)){
                cpt++;
            }
        }
        return cpt;
    }
}
