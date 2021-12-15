
public class Land02Bangbae extends Land000 {

	public Land02Bangbae(String name, int owner, int price, int building, int hotel, int pass, int passBuilding,
			int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super(name, owner, price, building, hotel, pass, passBuilding, passHotel, interceptPrice, interceptPrice2,
				interceptPrice3);
		name = "¹æ¹èµ¿";
		owner = 0;
		price = 80;
		building = 70;
		hotel = 200;
		pass = 4;
		passBuilding = 52;
		passHotel = 315;
		interceptPrice = 120;
		interceptPrice2 = 225;
		interceptPrice3 = 525;
	}

	@Override
	public String toString() {
		return "Land02Bangbae [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + getPrice()
				+ ", getBuilding()=" + getBuilding() + ", getHotel()=" + getHotel() + ", getPass()=" + getPass()
				+ ", getPassBuilding()=" + getPassBuilding() + ", getPassHotel()=" + getPassHotel()
				+ ", getInterceptPrice()=" + getInterceptPrice() + ", getInterceptPrice2()=" + getInterceptPrice2()
				+ ", getInterceptPrice3()=" + getInterceptPrice3() + ", getLandNumber()=" + getLandNumber()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
