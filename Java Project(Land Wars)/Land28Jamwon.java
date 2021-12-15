
public class Land28Jamwon extends Land000{

	public Land28Jamwon(String name, int owner, int price, int building, int hotel, int pass, int passBuilding,
			int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super(name, owner, price, building, hotel, pass, passBuilding, passHotel, interceptPrice, interceptPrice2,
				interceptPrice3);
		name = "Àá¿øµ¿";
		owner = 0;
		price = 320;
		building = 250;
		hotel = 700;
		pass = 28;
		passBuilding = 390;
		passHotel = 980;
		interceptPrice = 480;
		interceptPrice2 = 855;
		interceptPrice3 = 1905;
	}

	@Override
	public String toString() {
		return "Land28Jamwon [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + getPrice()
				+ ", getBuilding()=" + getBuilding() + ", getHotel()=" + getHotel() + ", getPass()=" + getPass()
				+ ", getPassBuilding()=" + getPassBuilding() + ", getPassHotel()=" + getPassHotel()
				+ ", getInterceptPrice()=" + getInterceptPrice() + ", getInterceptPrice2()=" + getInterceptPrice2()
				+ ", getInterceptPrice3()=" + getInterceptPrice3() + ", getLandNumber()=" + getLandNumber()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
