package Interface;

public interface ATM1 {
	public boolean withdraw(int accNo, double money);
	public boolean desposit(int accNo, double money);
	public double queryBalance(int accNo);
}
