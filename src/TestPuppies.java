import java.lang.reflect.InvocationTargetException;

public class TestPuppies {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("July");
        Puss myPussy = new Puss("Patito Onicha");
        //System.out.println(CreatingAnnotations.validador(myPussy));
        System.out.println(CreatingAnnotations.printActiob(myPussy));
    }
}
