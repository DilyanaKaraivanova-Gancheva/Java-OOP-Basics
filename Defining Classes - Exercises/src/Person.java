public class Person {
    private String name= "No name";
    private int age;

    public Person(){
        this.name = name;
        this.age = 1;
    }

    public Person(int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  this.name;
    }
    public  String setName(String n){
        return this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
