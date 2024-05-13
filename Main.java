import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Employee extends Person {
    private int empId;
    private double salary;
    public Employee(String name, LocalDate dateOfBirth, int empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;  }
    // Function to display employee details
    public void displayEmployeeDetails() {
        displayPersonName();
        displayPersonAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary); }}
public class Main {
    public static void main(String[] args) {
        // Example usage
        String personName = "John Doe";
        String dobString = "1990-05-12"; // YYYY-MM-DD format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobString, formatter);
        // Creating an Employee object
        Employee employee = new Employee(personName, dob, 1001, 50000.0);
        employee.displayEmployeeDetails(); }}
