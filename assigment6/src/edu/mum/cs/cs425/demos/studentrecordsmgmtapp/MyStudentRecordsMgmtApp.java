/**
 * 
 */
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	
	public static void main(String[] args) {
		Student[] students = {
	            new Student("110001", "Dave", LocalDate.of(1951, 11, 18)),
	            new Student("110002", "Anna", LocalDate.of(1990, 12, 7)),
	            new Student("110003", "Erica", LocalDate.of(1974, 1, 31)),
	            new Student("110004", "Carlos", LocalDate.of(2009, 8, 22)),
	            new Student("110005", "Bob", LocalDate.of(1990, 3, 5))
	        };

	        
	        printListOfStudents(students);

	        
	        List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);
	        System.out.println("Platinum Alumni Students:");
	        platinumAlumniStudents.forEach(student -> System.out.println(student.getName() + ", " + student.getDateOfAdmission()));

	}
	
	
    public static void printListOfStudents(Student[] students) {
        Arrays.stream(students)
            .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
            .forEach(student -> System.out.println(student.getStudentId() + ", " + student.getName() + ", " + student.getDateOfAdmission()));
    }

    
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
        return Arrays.stream(students)
            .filter(student -> student.getDateOfAdmission().isBefore(thirtyYearsAgo))
            .sorted((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()))
            .collect(Collectors.toList());
    }
    
    public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }
    
    public static int findSecondBiggest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

}
