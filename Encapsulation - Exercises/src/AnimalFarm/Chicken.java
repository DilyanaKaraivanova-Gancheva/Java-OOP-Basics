package AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private String productPerDay;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private String setName(String name) {
        if (name == null || name.isEmpty() || name.equals(" ")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        return this.name = name;
    }

    private int setAge(int age) {
        if (age > 15 || age < 0) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        return this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String calculateProductPerDay() {
       this.productPerDay = "";
        if (age >= 0 && age < 6) {
            this.productPerDay = "2";
        } else if (age >= 6 && age < 12) {
            this.productPerDay = "1";
        } else {
            this.productPerDay = "0.75";
        }
        return this.productPerDay;
    }

    public String getProductPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString(){
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",this.getName(),this.getAge(),this.getProductPerDay());
    }
}
