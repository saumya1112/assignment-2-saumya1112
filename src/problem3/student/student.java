package problem3.student;

import java.util.Objects;

public class student {
    private int rollNumber;
    private String name;

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    public student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
