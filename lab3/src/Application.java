public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// Interest Decorators.
		InterestPromotionDecorator promo1 = new Promotion1(AccountFactory.getChecking());
		InterestPromotionDecorator promo2 = new Promotion2(AccountFactory.getSaving());
		//Combining promotions.
		InterestPromotionDecorator promo3 = new Promotion3(promo2);

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown",promo1);
		accountService.createAccount("4253892", "John Doe",promo3);
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		accountService.addInterest("1263862");
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		accountService.addInterest("4253892");
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("Interest Description: " + account.getAccountType().getDescription());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
