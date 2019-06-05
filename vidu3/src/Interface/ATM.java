package Interface;

public interface ATM {
		public boolean withdraw(int accNo, double money);
		public boolean desposit(int accNo, double money);
		public double queryBalance(int accNo);
		public boolean login(String username, String password);
		public boolean logout(String username);
	}
