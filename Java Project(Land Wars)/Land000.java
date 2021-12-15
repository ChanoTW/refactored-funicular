
public abstract class Land000 {
	
	private final int landNumber = 0;
	private String name;
	private int owner;
	private int price;
	private int building;
	private int hotel;
	private int pass;
	private int passBuilding;
	private int passHotel;
	private int interceptPrice;
	private int interceptPrice2;
	private int interceptPrice3;
	
	

	public Land000(String name, int owner, int price, int building, int hotel, int pass,
			int passBuilding, int passHotel, int interceptPrice, int interceptPrice2, int interceptPrice3) {
		super();
		this.name = name;
		this.owner = owner;
		this.price = price;
		this.building = building;
		this.hotel = hotel;
		this.pass = pass;
		this.passBuilding = passBuilding;
		this.passHotel = passHotel;
		this.interceptPrice = interceptPrice;
		this.interceptPrice2 = interceptPrice2;
		this.interceptPrice3 = interceptPrice3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getOwner() {
		return owner;
	}


	public void setOwner(int owner) {
		this.owner = owner;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getBuilding() {
		return building;
	}


	public void setBuilding(int building) {
		this.building = building;
	}


	public int getHotel() {
		return hotel;
	}


	public void setHotel(int hotel) {
		this.hotel = hotel;
	}


	public int getPass() {
		return pass;
	}


	public void setPass(int pass) {
		this.pass = pass;
	}


	public int getPassBuilding() {
		return passBuilding;
	}


	public void setPassBuilding(int passBuilding) {
		this.passBuilding = passBuilding;
	}


	public int getPassHotel() {
		return passHotel;
	}


	public void setPassHotel(int passHotel) {
		this.passHotel = passHotel;
	}


	public int getInterceptPrice() {
		return interceptPrice;
	}


	public void setInterceptPrice(int interceptPrice) {
		this.interceptPrice = interceptPrice;
	}


	public int getInterceptPrice2() {
		return interceptPrice2;
	}


	public void setInterceptPrice2(int interceptPrice2) {
		this.interceptPrice2 = interceptPrice2;
	}


	public int getInterceptPrice3() {
		return interceptPrice3;
	}


	public void setInterceptPrice3(int interceptPrice3) {
		this.interceptPrice3 = interceptPrice3;
	}


	public int getLandNumber() {
		return landNumber;
	}


	@Override
	public String toString() {
		return "Land000 [landNumber=" + landNumber + ", name=" + name + ", owner=" + owner + ", price=" + price
				+ ", building=" + building + ", hotel=" + hotel + ", pass=" + pass + ", passBuilding=" + passBuilding
				+ ", passHotel=" + passHotel + ", interceptPrice=" + interceptPrice + ", interceptPrice2="
				+ interceptPrice2 + ", interceptPrice3=" + interceptPrice3 + "]";
	}
}
