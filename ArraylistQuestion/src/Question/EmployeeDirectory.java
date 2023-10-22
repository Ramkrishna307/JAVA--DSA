package Question;
import java.util.*;


class Employee {
    private String name;
    private String phoneNumber;
    private String email;
	private String address;

    public Employee(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
public class EmployeeDirectory {
	

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of employees
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume the newline character

	        // Read the employee details and store them in a List
	        List<Employee> employees = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	        	System.out.println("nsame");
	            String name = scanner.nextLine();
	            String address = scanner.nextLine();
	            String phoneNumber = scanner.nextLine();
	            String email = scanner.nextLine();
	            Employee employee = new Employee(name, address, phoneNumber, email);
	            employees.add(employee);
	        }
            System.out.println("enter name to search");
	        // Read the employee name to be searched
	        String searchName = scanner.nextLine();

	        // Search for the employee by name and print the details
	        for (Employee employee : employees) {
	            if (employee.getName().equals(searchName)) {
	                System.out.println(employee.getName() + ": " + employee.getAddress() + ", " + employee.getPhoneNumber() + ", " + employee.getEmail());
	                break;
	            }
	        }
	        scanner.close();
	    }
	}

