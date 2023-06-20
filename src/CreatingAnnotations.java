public class CreatingAnnotations {
    public static boolean validador(Object objeto){
        if (objeto.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is NOT very important");
        }
        return true;
    }

    public static boolean printActiob(Object objeto){
        for (Method method : myPussy.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myPussy);
                }
            }
        }
        return false;
    }

  /*
    for (Field field : myPussy.getClass().getDeclaredFields()) {
        if (field.isAnnotationPresent(ImportantString.class)) {
            Object objectValue = field.get(myPussy);
            if (objectValue instanceof  String stringValue) {
                System.out.println(stringValue.toUpperCase());
            }
        }
    }*/
}
