package Exam04;

public class TempEmployee {
	
	String empno; //사번
	String name; //이름
	int pay; //연봉
	
	
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	
	public String print() {
		return empno +" : "+name+" : "+pay;
	}
	
	
	
	
	

}
