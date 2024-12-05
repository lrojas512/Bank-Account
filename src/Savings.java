public class Savings extends Account {
    Savings() {
        accBalance = 0;
    }
    @Override
    public int getAccNum(int newNum) {
        return super.getAccNum(newNum);
    }
    @Override

    public double widthdrawal(double amountWithdrawn) {

        accBalance -= amountWithdrawn;

        if (accBalance < 500.00) {

            System.out.println("Charging a fee of $10 because you are " + "below $500");
            accBalance -= 10;
        }
        return accBalance;
    }
    private int timesDeposited = 1;

    @Override
    public double deposit(double amountDeposit) {
        accBalance += amountDeposit;
        System.out.println("This is deposit " + timesDeposited + " to this account");
        if (timesDeposited > 5) {
            System.out.println("Charging a fee of $10");
            accBalance -= 10.00;
        }
        timesDeposited++;
        return accBalance;

    }
    public double interest() {
        final double INTEREST_RATE = 0.015;
        double amountOfInterestGained = accBalance * INTEREST_RATE;
        accBalance += amountOfInterestGained;
        System.out.println("Customer earned " + amountOfInterestGained + " in interest");
        return accBalance;
    }
}
