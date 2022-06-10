package approche_object.fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        long debut = System.currentTimeMillis();


        for (int i = 0; i<100000; i++){
            builder.append(i+1).append(" ");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes : " +(fin-debut));


        String test = null;
        long debut2 = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            test += i+1 + " ";
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes : " +(fin2-debut2));
    }
}
