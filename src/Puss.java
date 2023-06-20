@VeryImportant
public class Puss {
    @ImportantString
    String name;
    int age;
    public Puss(String name) {
        this.name = name;
    }

    public void miau(){
        System.out.println("anyaaa!");
    }
    @RunImmediately
    public void jump() {
        System.out.println("humpt!");
    }
}
