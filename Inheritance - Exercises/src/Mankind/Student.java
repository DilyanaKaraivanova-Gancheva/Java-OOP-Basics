package Mankind;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName,String lastName, String facultyNumber){
        super();
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 && facultyNumber.length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }
    @Override
    public String toSring(){
        return "First Name: " + super.getFirstName() + "\n"
                + "Last Name: " + super.getLastName() + "\n"
                + "Faculty number: " + this.facultyNumber;
    }
}

