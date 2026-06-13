package Employee;

public class TestEmployee {

    public static void main(String[] args) {

        double LOW = 9.00;
        double HIGH = 14.65;

        Employee myGardener, myMaid;

        // Object creation
        myGardener = new Employee();
        myMaid = new Employee(22.50, "Parker");

        // setting values
        myGardener.setLastName("Greene");
        myGardener.setHourlyWage(LOW);

        // display
        System.out.println(
                "My gardener makes "
                        + myGardener.getWeeklyPay()
                        + " per week");

        System.out.println(
                "My maid makes "
                        + myMaid.getWeeklyPay()
                        + " per week");

        // change wage
        myGardener.setHourlyWage(HIGH);

        System.out.println(
                "My gardener makes "
                        + myGardener.getWeeklyPay()
                        + " per week");

        System.out.println(
                "My maid makes "
                        + myMaid.getWeeklyPay()
                        + " per week");
    }
}