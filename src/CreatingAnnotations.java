import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //@SuppressWarnings("unused")
        Cat myCat = new Cat("July");
        Puss myPussy = new Puss("Patito Onicha");
        if (myPussy.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is NOT very important");
        }

        for (Method method : myPussy.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myPussy);
                }
            }
        }
        for (Field field : myPussy.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(myPussy);
                if (objectValue instanceof  String stringValue) {
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
