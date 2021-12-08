package Exam04;

public class RegularEmployee {
	
	String empno; //사번
	String name; //이름
	int pay; //연봉
	int bonus; //보너스
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	public String print() {
		return empno + " : " + name + " : " + pay;	
		
		
	}
	

}
