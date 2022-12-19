package OchaTime;

public class MilkTea extends Tea {
	private int milkAmount;

	public MilkTea(String topping, String sugarAmount, String size, String type, int price, int milkAmount) {
		super(topping, sugarAmount, size, "Milk Tea", price);
		this.milkAmount = milkAmount;
	}

	public int getMilkAmount() {
		return milkAmount;
	}

	public void setMilkAmount(int milkAmount) {
		this.milkAmount = milkAmount;
	}

}
