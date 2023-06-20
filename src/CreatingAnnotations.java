import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static <T> boolean validador(T objeto){
        if (objeto.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is NOT very important");
        }
        return false;
    }
/*
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
    }*/
}
