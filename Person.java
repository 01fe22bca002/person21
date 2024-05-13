import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
class Person {
    protected String name;
    protected LocalDate dateOfBirth;
    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth; }
    // Function to display person name
    public void displayPersonName() {
        System.out.println("Person Name: " + name);  }
    // Function to calculate and display person age
    public void displayPersonAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        System.out.println("Person Age: " + age.getYears() + " years");
    }}
