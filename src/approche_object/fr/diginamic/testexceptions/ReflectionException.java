package approche_object.fr.diginamic.testexceptions;

public class ReflectionException extends Exception {
    public ReflectionException(String objectNull) {
        super(objectNull);
    }
}
