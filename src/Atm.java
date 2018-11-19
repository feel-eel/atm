import java.util.Scanner;


/// Account number: 100000001
/// Pin: 1234


public class Atm {
	private BankAccount bankAccount;
	
	public Atm(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void Menu() {
		Scanner in = new Scanner(System.in);
		int pin = 0;
		long num = 0;
		
		while (pin != bankAccount.getUser().getPIN() || num != bankAccount.getAccountNumber()) {
		System.out.println("Enter pin:");
		 pin = in.nextInt();
		if (pin == bankAccount.getUser().getPIN()) {
			System.out.println("Enter account number:");
			num = in.nextLong();
			if (num == bankAccount.getAccountNumber()) {
			
				int option = 0;
				while (option != 4) {
					System.out.println("Press 1 to deposit, 2 to withdraw, 3 show balance, 4 to exit");
					 option = in.nextInt();
					 
				if (option != 1 && option != 2 && option != 3 && option != 4) {
					System.out.println("Enter 1, 2, 3, or 4");
				} 
				
				else if (option == 1) {
					System.out.println("How much would you like to deposit?");
					int money = in.nextInt();
					int returnV = bankAccount.deposit(money);
						if (returnV == 1) {
							System.out.println("Now there is " + bankAccount.getBalance() + " dollars in your account");
						} else {
							System.out.println("Enter amount greater than 0");
						}
				} 
				
				else if (option == 2) {
					if (bankAccount.getBalance() == 0) {
						System.out.println("There is no money to take out :(");
					} else {
						System.out.println("How much would you like to withdraw?");
						int money = in.nextInt();
						int returnV = bankAccount.withdraw(money);
						if (returnV == 2) {
							System.out.println("Now there is " + bankAccount.getBalance() + " dollars in your account");
						} 
						else if (returnV == 1){
							System.out.println("Enter amount greater than 0");
						} else {
							System.out.println("Sorry, you're too broke for that :(");
						}				
					} 
				}
				
				else if (option == 3) {
					System.out.println("There is " + bankAccount.getBalance() + " dollars in your account");	
				} 
				
				else if (option == 4) {
					System.out.println("Have a good day!");
				} 
			}
			}
			else {
				System.out.println("Credentials invalid");
			}
		}
		else {
			System.out.println("Credentials invalid");
		}
		}
		in.close();
	}
		
	
	
	public static void main(String[] args) {
	
		Atm atm = new Atm(new BankAccount(0, new User(1234, "Julia", "2/11/01", "3 Cherry Road")));
		
		atm.Menu();
	}
}