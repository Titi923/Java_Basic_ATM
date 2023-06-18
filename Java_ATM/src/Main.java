import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner checkIdentity = new Scanner(System.in);

    User user_1 = new User("Dorel", 123, 1234, 503.12d);

    System.out.println("Enter account number: ");
    int accountNumber = checkIdentity.nextInt();
    System.out.println("Enter your PIN: ");
    int userPin = checkIdentity.nextInt();

    if (accountNumber == user_1.getAccountNumber() && userPin == user_1.getPin()) {
        AccountManager.manageAccount(user_1, user_1.getAccountNumber(), user_1.getPin());
    } else {
        System.out.println("Invalid login details, for " + user_1.userName);
    }

    checkIdentity.close();
  }
}
