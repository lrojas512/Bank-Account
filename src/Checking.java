public class Checking extends Account {
    Checking() {
        accBalance = 0;
    }
    @Override
    public int getAccNum(int newNum) {
        return super.getAccNum(newNum);
    }
    @Override
    public double widthdrawal(double amountWithdrawn) {
        if (amountWithdrawn > accBalance) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            accBalance -= 20.00;
        }
        accBalance -= amountWithdrawn;
        return accBalance;
    }
}
