package tp_11_collections_set.set;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> doubleTest = new HashSet<>();
        Collections.addAll(doubleTest, -12.45,1.5, 8.25,-7.32,13.3,48.2,0.01);
        System.out.println(doubleTest);

        System.out.println(Collections.max(doubleTest));

        // suppr du plus petit
        doubleTest.remove(Collections.min(doubleTest));
        System.out.println(doubleTest);
    }
}
