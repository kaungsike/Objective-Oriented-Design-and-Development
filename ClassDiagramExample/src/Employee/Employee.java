package Employee;

public class Employee {

    private String lastName;
    private double hourlyWage;
    private double weeklyPay;

    // default constructor
    public Employee() {
        this.hourlyWage = 10.00;
        calculateWeeklyPay();
    }

    // parameterized constructor
    public Employee(double rate, String name) {
        this.lastName = name;
        setHourlyWage(rate);
        calculateWeeklyPay();
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setHourlyWage(double wage) {

        double MAXWAGE = 70.00;
        double MINWAGE = 10.00;

        if (wage < MINWAGE) {
            this.hourlyWage = MINWAGE;
        }
        else if (wage > MAXWAGE) {
            this.hourlyWage = MAXWAGE;
        }
        else {
            this.hourlyWage = wage;
        }

        calculateWeeklyPay();
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    private void calculateWeeklyPay() {
        double WORK_WEEK_HOURS = 40.0;
        this.weeklyPay = hourlyWage * WORK_WEEK_HOURS;
    }
}