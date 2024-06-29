public class Convertion {


    public static void main(String[] args) {
        //exercice 2
        int pieds = 10;
        int pouces = 20;
        float resultat;
        resultat = convertir(pieds, pouces);
        System.out.println("Exercice 2");
        System.out.println("----------\n");
        System.out.println("La conversion en cm donne: "+resultat);
        System.out.println("_________________\n");
    }
    static float convertir(int pi, int po) {
        final float PIED = 12;
        final float POUCE = 2.54F;
        float res;
        res = (pi * PIED + po) * POUCE;
        return res;
    }
}