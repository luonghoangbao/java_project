package Interface;

public class AIMImpl implements ATM1, ATM2{
	public int idATM;
	public int accountld;
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean withdraw(int accNo, double money) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean desposit(int accNo, double money) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double queryBalance(int accNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
