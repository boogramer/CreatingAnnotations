@VeryImportant
public class Cat {
    @ImportantString
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }
    @RunImmediately(times = 3)
    public void eat() {
        System.out.println("Uwu");
    }

    public void meow(){
        System.out.println("Nyaaaa!");
    }
}
