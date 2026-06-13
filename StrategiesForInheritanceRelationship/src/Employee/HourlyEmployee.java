package Employee;

public class HourlyEmployee extends Employee {

    private float hoursWorked;
    private float hourlyRate;

    public void setHoursWorked(float hours) {
        this.hoursWorked = hours;

        setWeeklySalary(hoursWorked * hourlyRate);
    }

    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHourlyRate(float rate) {
        this.hourlyRate = rate;

        setWeeklySalary(hoursWorked * hourlyRate);
    }

    public float getHourlyRate() {
        return this.hourlyRate;
    }
}