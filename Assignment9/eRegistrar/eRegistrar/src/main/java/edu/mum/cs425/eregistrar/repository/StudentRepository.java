package edu.mum.cs425.eregistrar.repository;

import edu.mum.cs425.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}