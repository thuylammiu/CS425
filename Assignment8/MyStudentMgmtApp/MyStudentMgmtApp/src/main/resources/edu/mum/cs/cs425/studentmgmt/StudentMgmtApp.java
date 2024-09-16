package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       
    	Transcript transcript1 = new Transcript(1L, "BS Computer Science");

        
        Classroom classroom1 = new Classroom(1L, "McLaughlin building", "M105");

       
        Student s1 = new Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
        s1.setTranscript(transcript1);
        s1.setClassroom(classroom1);

        
        saveStudent(s1);
    }

    
    public void saveStudent(Student student) {
        studentRepository.save(student);
        System.out.println("Student saved successfully!");
    }
}
