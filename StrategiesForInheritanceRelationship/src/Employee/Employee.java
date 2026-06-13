package Employee;

public class Employee {

    private String empNum;
    private float weeklySalary;

    public void setEmpNum(String number) {
        this.empNum = number;
    }

    public String getEmpNum() {
        return this.empNum;
    }

    public void setWeeklySalary(float salary) {
        this.weeklySalary = salary;
    }

    public float getWeeklySalary() {
        return this.weeklySalary;
    }
}