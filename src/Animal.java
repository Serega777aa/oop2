public abstract class Animal {
    private String sex;
    private String name;
    private int age;


    public void SetSex (String Sex){
        this.sex = Sex;
    }
    public void SetName (String Name){
        this.name = Name;
    }
    public void SetAge(int Age){
        this.age = Age;
    }

    public String getSex (){
        return sex;
    }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract void voice();
}
