package Exam02;

public class 차노 extends Person{
	//추상 메소드가 있는 추상 클래스를 상속 받는다면
	//반드시 추상 메소드를 구현해야한다.

	@Override
	public void breath() {
		System.out.println("차노 숨쉬다");
	}

	@Override
	public void eat() {
		System.out.println("차노 짬뽕 곱빼기를 먹다");
	}

	@Override
	public void think() {
		System.out.println("차노 생각하다");
	}


}
