package Employee;

public class CommissionEmployee extends Employee {

    private float commissionRate;

    public void setCommissionRate(float rate) {
        this.commissionRate = rate;
    }

    public float getCommissionRate() {
        return this.commissionRate;
    }
}
