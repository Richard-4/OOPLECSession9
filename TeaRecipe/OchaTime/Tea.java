package OchaTime;

public abstract class Tea {
	protected String topping;
	protected String sugarAmount;
	protected String size;
	protected String type;
	protected int price;

	public Tea(String topping, String sugarAmount, String size, String type, int price) {
		this.topping = topping;
		this.sugarAmount = sugarAmount;
		this.size = size;
		this.type = type;
		this.price = price;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSugarAmount() {
		return sugarAmount;
	}

	public void setSugarAmount(String sugarAmount) {
		this.sugarAmount = sugarAmount;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
