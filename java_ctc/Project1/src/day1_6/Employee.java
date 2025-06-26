package day1_6;

class Employee {
    private static int idCounter = 100;
    private int empId;
    private String empName;
    private double basicSalary;
    private double HRA, PF, PT, netSalary, grossSalary;

    public Employee(String name, double basicSalary) {
        this.empId = ++idCounter;
        this.empName = name;
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() {
        HRA = 0.5 * basicSalary;
        PF = 0.12 * basicSalary;
        PT = 200;
        grossSalary = basicSalary + HRA;
        netSalary = grossSalary - (PF + PT);
    }

    public void printDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA + ", PF: " + PF + ", PT: " + PT);
        System.out.println("Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 30000);
        e1.calculateSalary();
        e1.printDetails();
    }
}
