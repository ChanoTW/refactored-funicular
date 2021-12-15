
public class Land01Suseo extends Land000{

	public Land01Suseo(String name, int owner, int price, int building, int hotel, int pass,
			int passBuilding, int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super(name, owner, price, building, hotel, pass, passBuilding, passHotel, interceptPrice, interceptPrice2,
				interceptPrice3);
		name = "¼ö¼­µ¿";
		owner = 0;
		
		price = 50;
		building = 70;
		hotel = 200;
		
		pass = 2;
		passBuilding = 25;
		passHotel = 175;
		
		interceptPrice = 75;
		interceptPrice2 = 180;
		interceptPrice3 = 480;
	}

	@Override
	public String toString() {
		return "Land01Suseo [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + getPrice()
				+ ", getBuilding()=" + getBuilding() + ", getHotel()=" + getHotel() + ", getPass()=" + getPass()
				+ ", getPassBuilding()=" + getPassBuilding() + ", getPassHotel()=" + getPassHotel()
				+ ", getInterceptPrice()=" + getInterceptPrice() + ", getInterceptPrice2()=" + getInterceptPrice2()
				+ ", getInterceptPrice3()=" + getInterceptPrice3() + ", getLandNumber()=" + getLandNumber()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
