public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Ima", "F", 33, "lib1");
        Persona son = new Persona("Sin", "F", 13, "lib2");

        papa.PersLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        papa.PersLibr.AddBook("Носов", "Незнайка на луне", "RU");

        son.PersLibr.AddBook("Народное авторство", "Азбука", "RU");
        son.PersLibr.AddBook("", "Light blue", "RU");
        papa.AddName(son);
        view.treeView(papa, 0);

        System.out.println("*".repeat(15));
        view.bookView(papa);
        System.out.println("*".repeat(15));
        view.bookView(son);
        papa.Voice();

        Dog dog = new Dog("мальчик", "Мухтар", 2, son);
        System.out.print(dog.getName() + ": ");
        dog.voice();


    }
}