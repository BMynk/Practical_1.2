public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000.00);
        Employee emp2 = new Employee("Jane", "Smith", 6000.00);

        // Display initial yearly salaries
        System.out.printf("Employee 1: %s %s - Yearly Salary: %.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("Employee 2: %s %s - Yearly Salary: %.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give each a 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // Display new yearly salaries
        System.out.println("\nAfter 10% raise:");
        System.out.printf("Employee 1: %s %s - Yearly Salary: %.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("Employee 2: %s %s - Yearly Salary: %.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}