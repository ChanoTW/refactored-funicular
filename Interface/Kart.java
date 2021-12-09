package Exam02;

public interface Kart {
	
	//카트의 설계도
	
	//시작위치 = 0;
	int position = 0;//게임이 시작되는 위치
	
	//앞으로 가는 기능
	public abstract void go(int num); // num -> 얼마만큼 앞으로 갔는지
	
	//뒤로 가는 기능
	public abstract void back(int num); // num -> 얼마만큼 뒤로 갔는지
	
	//부스터 기능
	public abstract void booster(int power); // power -> 부스터를 얼마나 쎄게 할거인지
	
	
}
