package Employee;

public class TestInheritedMembers {

    public static void main(String[] args) {

        CommissionEmployee salesperson =
                new CommissionEmployee();

        salesperson.setEmpNum("222");
        salesperson.setWeeklySalary(300.0f);
        salesperson.setCommissionRate(0.15f);

        System.out.println(
                "Employee Number: "
                        + salesperson.getEmpNum());

        System.out.println(
                "Weekly Salary: "
                        + salesperson.getWeeklySalary());

        System.out.println(
                "Commission Rate: "
                        + salesperson.getCommissionRate());



        HourlyEmployee worker =
                new HourlyEmployee();

        worker.setHourlyRate(20);
        worker.setHoursWorked(40);

        System.out.println(
                "Worker Weekly Salary: "
                        + worker.getWeeklySalary());
    }
}