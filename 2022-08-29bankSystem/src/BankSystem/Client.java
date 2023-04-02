package BankSystem;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	protected float commissionRate;
	protected float interestRate;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accounts = new Account[5];
		this.logger = new Logger("TBD - enter the database driver name");
	}


	public float getCommissionRate() {
		return commissionRate;
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				long ts = System.currentTimeMillis();
				int id=this.id;
				float amount=account.getBalance();
				String description = "addAccount";
				Log log = new Log(ts, id, description, amount);
				logger.log(log);
				return;
			}
		}
		System.out.println("cant open new account");
	}

	
	public Account getAccount(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == id) {
				return accounts[i];
			}
		}
		return null;
	}

	public void removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			Account currAccount = accounts[i];
			if (currAccount != null && currAccount.getId() == accountId) {
				this.accounts[i]= null;
				this.balance += currAccount.getBalance();
				
				long ts = System.currentTimeMillis();
				float amount=currAccount.getBalance();
				String description = "removeAccount";
				Log log = new Log(ts, this.id, description, amount);
				logger.log(log);

				return;

			}

		}
System.out.println("removeAccount failed - not found");
	}
	
	
	public void deposit(float amount) {
		this.balance = this.balance+amount;
		float commission = amount*commissionRate;
		this.balance = this.balance -commission;
		long ts = System.currentTimeMillis();
		int id=this.id;
		String description = "deposit";
		Log log = new Log(ts, id, description, amount);
		logger.log(log);
		
	}
	
	
	public void withdraw(float amount) {
		if(amount>balance) {
			System.out.println("withdraw failed");
			return;
		}
		this.balance = this.balance-amount;
		float commission = amount*commissionRate;
		this.balance = this.balance -commission;
		long ts = System.currentTimeMillis();
		int id=this.id;
		String description = "withdraw";
		Log log = new Log(ts, id, description, amount);
		logger.log(log);
	}

	public void autoUpdateAccounts() {
		for (int i = 0; i < accounts.length; i++) {
			Account curr=accounts[i];
			if (curr != null) {
				float interest = curr.getBalance()*interestRate;
				this.balance +=interest;
				
				long ts = System.currentTimeMillis();
				String description = "interest due for account" + curr.getId();
				float amount =interest;
				Log log = new Log(ts, this.id, description, amount);
				logger.log(log);
			}
	}
		
		
		
}
public float getFortune() {
	double fortune = this.balance;
	for (int i = 0; i < accounts.length; i++) {
		if (accounts[i] != null) {
			fortune+= this.accounts[i].getBalance();
		}
	}return (float) fortune;
}



}
