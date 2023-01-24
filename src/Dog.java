public class Dog extends Animal {

    Persona ovner;

    public Dog(String sex, String name, int age, Persona ovner) {
        SetSex(sex);
        SetName(name);
        SetAge(age);
        this.ovner = ovner;
    }

    public void voice() {
        System.out.println("гав - гав");
    }
}
