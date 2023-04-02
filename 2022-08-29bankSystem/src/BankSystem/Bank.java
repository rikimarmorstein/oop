package BankSystem;

public class Bank {

	private Client []clients;
	private float balance;
	private Object accountUpdater;
	private Logger logger;
	

	public static Bank instance = new Bank();
	
	
	public static Bank getInstance() {
		return instance;
	}


	private Bank() {
		this.clients = new Client[100];
		this.logger = new Logger("TBD - enter the database driver name");
	}
	
	
	public Client[] getClients() {
		return clients;
	}


	public float getBalance() {
		return balance;
	}
	
	public float getTotalClientFortune() {
		float sumTotal=0;
		for (int i = 0; i < clients.length; i++) {
			if(this.clients[i]!=null)
			sumTotal += this.clients[i].getFortune();
		}return sumTotal;
	}
	
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i]==null) {
				clients[i] = client;
				long ts = System.currentTimeMillis();
				int id=clients[i].getId();
				String description = "addClient to bank";
				float amount = clients[i].getBalance();
				Log log = new Log(ts, id, description, amount);
				logger.log(log);
				return;
			}
		}
	}/////ad can shihur
	
	public void removeClient(int id) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i]!=null && clients[i].getId()==id) {
				Client clientDelete =clients[i];
				long ts = System.currentTimeMillis();
			//	 id=clientDelete.getId();
				String description = "remove the client";
				float amount = clientDelete.getBalance();
				Log log = new Log(ts, id, description, amount);
				logger.log(log);
				clients[i]=null;
				return;
			}
		}System.out.println("client not found");
	}
	
	
	public void startAccountUpdater() {
		
	}
	
	public void addCommission(float amount) {///???
	for (int i = 0; i < clients.length; i++) {
			if (clients[i]!=null) {
			this.balance +=amount*clients[i].getCommissionRate();	
			}
		}		
	///??? הוספתי גט בכליינט
	}
	


	public void printClientList() {

	}

}
