package edu.mum.cs425.eregistrar.service;

import edu.mum.cs425.eregistrar.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}