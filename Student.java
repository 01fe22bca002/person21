import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class Student {
    private String name;
    private LocalDate dateOfBirth;
    public Student(String name, String dobString) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dobString, formatter);
    }
    // Function to display student name
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }
    // Function to calculate and display student age
    public void displayStudentAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        System.out.println("Student Age: " + age.getYears() + " years");
    }
    public static void main(String[] args) {
        // Example usage
        String studentName = "John Doe";
        String dobString = "2000-05-12"; // YYYY-MM-DD format
        Student student = new Student(studentName, dobString);
        student.displayStudentName();
        student.displayStudentAge();
    }
}
