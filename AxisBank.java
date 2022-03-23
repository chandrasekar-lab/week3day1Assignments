package week3_day1_Assignments;

public class AxisBank {

	public void deposit() {
		System.out.println("Deposit: overriding deposit method");

	}

	public static void main(String[] args) {

		BankInfo bankinfo = new BankInfo();
		bankinfo.deposit();
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();

	}

}
