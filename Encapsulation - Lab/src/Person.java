public class Person {
    private  String firstNme;
    private  String lastNme;
    private  int age;
    private double salry;

    public Person(String firstNme, String lastNme, int age,double salry) {
        this.setFirstNme(firstNme);
        this.setLastNme(lastNme);
        this.setAge(age);
        this.setSalry(salry);
    }

    public double getSalry() {
        return salry;
    }

    public void setSalry(double salry) {
        if (salry < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
            this.salry = salry;
    }

    public String getFirstNme() {
        return firstNme;
    }

    public String getLastNme() {
        return lastNme;
    }

    public int getAge() {
        return age;
    }

    public void setFirstNme(String firstNme) {
        if(firstNme.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
            this.firstNme = firstNme;
    }

    public void setLastNme(String lastNme) {
        if (lastNme.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastNme = lastNme;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }
    public void increseSlary(double bonus){
        if (this.getAge() > 30){
            this.salry +=  this.salry * (bonus/100);
        }else{
            this.salry += this.salry * (bonus/200);
        }
    }

    @Override
    public String toString() {
        return this.getFirstNme() + " " + this.getLastNme() + " gets " + this.getSalry() + " leva";
    }
}
