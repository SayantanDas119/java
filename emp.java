
import java.util.Date;

class Employee {
  private String name;
  private double salary;
  private Date hireDate;

  public Employee(String name, double salary, Date hireDate) {
    this.name = name;
    this.salary = salary;
    this.hireDate = hireDate;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public int calculateYearsOfService() {
    Date currentDate = new Date();
    long currentTime = currentDate.getTime();
    long hireTime = hireDate.getTime();
    long timeDifference = currentTime - hireTime;
    long millisecondsInYear = 1000L * 60 * 60 * 24 * 365;
    return (int) (timeDifference / millisecondsInYear);
  }

  public static void main(String[] args) {
    // Create an Employee object
    Date hireDate = new Date(120, 0, 15); // Year 2020, Month 1 (0-based), Day 15
    Employee employee = new Employee("John Doe", 60000.0, hireDate);

    // Calculate years of service
    int yearsOfService = employee.calculateYearsOfService();

    // Display employee information
    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Salary: $" + employee.getSalary());
    System.out.println("Hire Date: " + employee.getHireDate());
    System.out.println("Years of Service: " + yearsOfService + " years");
  }
}
