package Mankind;

public class Worker extends Human {
    private  double salary;
    private double hours;

    public Worker(double salary,double hours){
        super();
        this.setSalary(salary);
        this.setHours(hours);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double calculateSalaryPerHour(double salary,double hours){
        return (salary / 7) / hours;
    }
}
