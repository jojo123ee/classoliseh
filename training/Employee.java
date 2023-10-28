
public class Employee {
    String name;
    String address;
    String phoneNumber;
    Double salary;

    public Employee(String name, String address, String phoneNumber, Double salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                '}';
    }


    public double bonus(double amount){
        return amount;
    }

    public double debt(double amount){
        return amount;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Joseph","USA","234702u208230",2000.00);
        Employee employee1 = new Employee("Oliseh","USA","234702u208230",1000.00);
        System.out.println(employee1);
        double bonus = employee.bonus(100.50);
        double debt = employee.debt(100.50);
        System.out.println("Bonus: " +" "+bonus );
        System.out.println("Debt: " +" "+debt);
        double salary = employee1.salary + bonus;
        System.out.println("Salary: " + " "+ salary);

    }
}