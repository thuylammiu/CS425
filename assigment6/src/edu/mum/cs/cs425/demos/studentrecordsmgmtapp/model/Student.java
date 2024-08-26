package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
public class Student {
	private String studentId;
    private String name;
    private LocalDate admissionDate;

    
    public Student() {
    }

    // Constructor with studentId
    public Student(String studentId) {
        this.studentId = studentId;
    }

    // Constructor with studentId and name
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with all fields
    public Student(String studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.admissionDate = dateOfAdmission;
    }

    // Getter and Setter methods
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return admissionDate;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.admissionDate = dateOfAdmission;
    }
}
