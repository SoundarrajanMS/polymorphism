package org.emp;

public class Employee {
	private void empid(int id) {
		System.out.println("1234");
	}
	private void empid(String name) {
	
System.out.println("soundar");
	}
	private void empid(long phno,String emil,double weight) {
		
System.out.println(phno);
	

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empid(2434);
		e.empid("hchgcgh");
		e.empid(9965105007l, "ms.soundr09@gmail.com", 55.5);
	}

}
