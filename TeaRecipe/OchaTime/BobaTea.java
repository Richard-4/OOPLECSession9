package OchaTime;

public class BobaTea extends Tea {

	private int boba;

	public BobaTea(String topping, String sugarAmount, String size, String type, int price, int boba) {
		super(topping, sugarAmount, size, "Boba Tea", price);
		this.boba = boba;
	}

	public int getBoba() {
		return boba;
	}

	public void setBoba(int boba) {
		this.boba = boba;
	}

}
