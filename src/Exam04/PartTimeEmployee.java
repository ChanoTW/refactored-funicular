package Exam04;

public class PartTimeEmployee {
	
	String empno; //사번
	String name; //이름
	int pay; //일당
	int workDay; //일수
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		return pay * workDay;
	}
	
	public String print() {
		return empno+" : "+name+" : "+pay;
	}
	
	
}
