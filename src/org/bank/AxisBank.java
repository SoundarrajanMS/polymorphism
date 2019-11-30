package org.bank;

public class AxisBank extends Bankinfo {
	
	protected void deposit(int x) {
		System.out.println("deposited amount is not "+x);
		

	}
	protected void saving(char u) {
		System.out.println("saving amount is not "+u);

	}
	private void accNo(String l) {
		System.out.println("soundar the all");
		

	}
public static void main(String[] args) {
	Bankinfo a= new AxisBank ();
a.deposit(2);
a.fixed(3);
a.saving('r');




}
}
