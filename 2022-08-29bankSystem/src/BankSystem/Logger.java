package BankSystem;

public class Logger {

	
	private String driverName;
	
	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}
	
	public void log(Log log) {
		System.out.println(log);
	}
	
	public Log[] getLogs() {
	return null;
	}
	
}
