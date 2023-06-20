import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static boolean validador(Object objeto){
        if (objeto.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is NOT very important");
        }
        return false;
    }

    public static boolean printActiob(Object objeto) throws InvocationTargetException, IllegalAccessException {
        for (Method method : objeto.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(objeto);
                }
            }
        }
        return false;
    }

  public static boolean nameToUpperCase(Object objeto){
      for (Field field : objeto.getClass().getDeclaredFields()) {
          if (field.isAnnotationPresent(ImportantString.class)) {
              Object objectValue = field.get(objeto);
              if (objectValue instanceof  String stringValue) {
                  System.out.println(stringValue.toUpperCase());
              }
          }
      }
      return false;
  }
}
