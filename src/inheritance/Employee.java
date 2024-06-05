package inheritance;

public class Employee extends Person {

    private String employeeId;
    private String employeeNumber;
    private String employeeTitle;

    public Employee(){
        System.out.println("Employee constructor");
    }

    public Employee(String name, String employeeNumber, String employeeTitle) {
        setName(name);
        setEmployeeNumber(employeeNumber);
        setEmployeeTitle(employeeTitle);

        System.out.println("Employee name: " + getName() + " employee number: " + getEmployeeNumber() + " employee title: " + getEmployeeTitle());
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
}
