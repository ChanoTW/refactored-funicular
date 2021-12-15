
public class Land07Sadang extends Land000{

	public Land07Sadang(String name, int owner, int price, int building, int hotel, int pass, int passBuilding,
			int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super(name, owner, price, building, hotel, pass, passBuilding, passHotel, interceptPrice, interceptPrice2,
				interceptPrice3);
		name = "»ç´çµ¿";
		owner = 0;
		price = 120;
		building = 70;
		hotel = 200;
		pass = 8;
		passBuilding = 91;
		passHotel = 420;
		interceptPrice = 180;
		interceptPrice2 = 285;
		interceptPrice3 = 585;
	}

	@Override
	public String toString() {
		return "Land07Sadang [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + getPrice()
				+ ", getBuilding()=" + getBuilding() + ", getHotel()=" + getHotel() + ", getPass()=" + getPass()
				+ ", getPassBuilding()=" + getPassBuilding() + ", getPassHotel()=" + getPassHotel()
				+ ", getInterceptPrice()=" + getInterceptPrice() + ", getInterceptPrice2()=" + getInterceptPrice2()
				+ ", getInterceptPrice3()=" + getInterceptPrice3() + ", getLandNumber()=" + getLandNumber()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
