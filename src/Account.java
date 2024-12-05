public class Account {
    private static int accNum;
    public double accBalance;
    public Account() {
        accBalance = 0;
        accNum = 10001;
    }
    public Account(double newAmount, int newAccNum) {
        accBalance = newAmount;
        accNum = newAccNum;
    }
    public int getAccNum(int newNum) {
        accNum = newNum;
        return newNum;
    }
    public double getAccountBalance() {
        return accBalance;
    }
    public void setAccBalance(double newAccBalance) {
        accBalance = newAccBalance;
    }
    public double widthdrawal(double amountWithdrawn) {
        accBalance -= amountWithdrawn;
        return accBalance;
    }
    public double deposit(double amountDeposit) {
        accBalance += amountDeposit;
        return accBalance;
    }
}
