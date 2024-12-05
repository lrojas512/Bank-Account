import java.util.Scanner;
public class Lab4 {

    public static void printMenu() {

        System.out.println("1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit");

    }

    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        Checking checkingAcc = new Checking();
        Savings savingsAcc = new Savings();
        int menuChoice;
        do {
            printMenu();

            menuChoice = myScan.nextInt();
            switch(menuChoice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    double amountToWithdraw = myScan.nextDouble();
                    checkingAcc.widthdrawal(amountToWithdraw); break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    double savingsAmountToWithdraw = myScan.nextDouble();
                    savingsAcc.widthdrawal(savingsAmountToWithdraw);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    double amountToDeposit = myScan.nextDouble();
                    checkingAcc.deposit(amountToDeposit);
                    System.out.println("Doing default deposit");
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    double amountToDepositSavings = myScan.nextDouble();
                    savingsAcc.deposit(amountToDepositSavings);
                    break;
                case 5:
                    System.out.println("Your balance for checking "+ checkingAcc.getAccNum(10001) + " is " + checkingAcc.getAccountBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " +savingsAcc.getAccNum(10002) +" is " + savingsAcc.getAccountBalance());
                    break;
                case 7:
                    savingsAcc.interest();
                    break;
            }

        }

        while(menuChoice != 8);

    }

}
