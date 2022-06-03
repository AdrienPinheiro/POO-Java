package approche_object.utils;

import java.util.Arrays;

public class ConversionNombre {
    public static int getConvertToNumber(String chaine){
        chaine = chaine.replaceAll("\\s", "");
        chaine = chaine.replaceAll("[a-zA-Z]", "");
        int chaineInt = Integer.parseInt(chaine);
        return chaineInt;
    }

    public static int maxInt(int a, int b){
        return Integer.max(a, b);
    }
}