package com.company;
import java.io.Serializable;

public class Course implements Serializable {
    String name;
    int numberOfStudents;

    public String toString() {
        return this.name + " Course has " + this.numberOfStudents + " students.";

    }
}
