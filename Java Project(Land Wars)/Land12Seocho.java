
public class Land12Seocho extends Land000 {

	public Land12Seocho(String name, int owner, int price, int building, int hotel, int pass, int passBuilding,
			int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super(name, owner, price, building, hotel, pass, passBuilding, passHotel, interceptPrice, interceptPrice2,
				interceptPrice3);
		name = "º≠√ µø";
		owner = 0;
		price = 180;
		building = 130;
		hotel = 400;
		pass = 14;
		passBuilding = 180;
		passHotel = 665;
		interceptPrice = 270;
		interceptPrice2 = 465;
		interceptPrice3 = 1065;
	}

	@Override
	public String toString() {
		return "Land12Seocho [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + getPrice()
				+ ", getBuilding()=" + getBuilding() + ", getHotel()=" + getHotel() + ", getPass()=" + getPass()
				+ ", getPassBuilding()=" + getPassBuilding() + ", getPassHotel()=" + getPassHotel()
				+ ", getInterceptPrice()=" + getInterceptPrice() + ", getInterceptPrice2()=" + getInterceptPrice2()
				+ ", getInterceptPrice3()=" + getInterceptPrice3() + ", getLandNumber()=" + getLandNumber()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
