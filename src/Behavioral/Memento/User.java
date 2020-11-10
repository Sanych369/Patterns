package Behavioral.Memento;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("create: name = %s, age = %s\n", name, age);
    }
    public Memento save() {
        System.out.printf("save: name = %s, age = %s\n", name, age);
        return new Memento(name, age);
    }
    public void restore(Memento memento) {
        name = memento.getName();
        age = memento.getAge();
        System.out.printf("restore: name = %s, age = %s\n", name, age);
    }
}
