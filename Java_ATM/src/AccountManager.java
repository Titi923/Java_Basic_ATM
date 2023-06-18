import java.util.Scanner;

public class AccountManager {

  static void manageAccount(User theUser, int accountNumber, int userPin) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nChecking Account of " + theUser.userName + ":");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Deposit funds");
    System.out.println("Type 3 - Withdraw Funds");
    System.out.println("Type 4 - Exit");
    System.out.print("Your input: ");

    int option = scanner.nextInt();
    switch (option) {
      case 1:
        System.out.println("\nYou have $" + theUser.getBalance());
        manageAccount(theUser, accountNumber, userPin);
        break;
      case 2:
        System.out.println("\nHow much you want to deposit? ($)");
        System.out.print("Your input: ");
        double depositAmount = scanner.nextInt();
        theUser.setBalance(depositAmount + theUser.getBalance());
        manageAccount(theUser, accountNumber, userPin);
        break;
      case 3:
        System.out.println("\nHow much you want to withdraw? ($)");
        System.out.print("Your input: ");
        double withdrawAmount = scanner.nextInt();
        if (theUser.getBalance() >= withdrawAmount) {
          theUser.setBalance(theUser.getBalance() - withdrawAmount);
        } else {
          System.out.println("\nBalance cannot be negative!");
        }
        manageAccount(theUser, accountNumber, userPin);
      case 4:
        System.out.println("\nGoodbye!");
        break;
      default:
        System.out.println("\nInvalid input, choose between 1-4.");
        manageAccount(theUser, accountNumber, userPin);
        break;
    }
    scanner.close();
  }
}
