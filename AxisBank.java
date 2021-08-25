package week3.day1.org.system;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Changes or Modification in deposit");
		
	}
	
	public static void main(String[] args) {
		AxisBank bankobj = new AxisBank();
		bankobj.saving();
		bankobj.fixed();
		bankobj.deposit();
		
	}
	
	

}
