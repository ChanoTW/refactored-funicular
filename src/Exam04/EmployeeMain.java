package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("201101", "����", 4000, 800);
		
		System.out.println(regular.print()); 
		System.out.println(regular.getMoneyPay() + "����");
	}

}
