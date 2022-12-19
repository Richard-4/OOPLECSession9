package OchaTime;

public class GreenTea extends Tea {
	private int leaves;

	public GreenTea(String topping, String sugarAmount, String size, String type, int price, int leaves) {
		super(topping, sugarAmount, size, "Green Tea", price);
		this.leaves = leaves;
	}

	public int getLeaves() {
		return leaves;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}

}
