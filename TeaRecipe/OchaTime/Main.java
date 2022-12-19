package OchaTime;

import java.util.*;

public class Main {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<Tea> Teas = new ArrayList<>();

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Teas.add(new GreenTea("Boba", "Half", "Regular", "Green Tea", 20000, 5));
		Teas.add(new MilkTea("Pudding", "Half", "Large", "Milk Tea", 20000, 5));
		Teas.add(new BobaTea("Pudding", "Half", "Large", "Boba Tea", 20000, 5));
		while (true) {
			int choose = mainMenu();
			if (choose == 1) {
				viewTea();
			} else if (choose == 2) {
				addTea();
			} else if (choose == 3) {
				deleteTea();
			} else if (choose == 4) {
				buyTea();
			} else if (choose == 5) {
				System.exit(0);
			}
		}
	}

	public int mainMenu() {
		int choose = -1;
		do {
			try {
				System.out.print("1.	View Tea\r\n" + "2.	Add New Tea\r\n" + "3.	Delete Tea\r\n" + "4.	Buy\r\n"
						+ "5.	Exit\r\n" + "Choose [1 - 5]: ");
				choose = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (choose < 1 || choose > 5);
		return choose;
	}

	public void viewTea() {
		int no = 1;
		String topping;
		String sugarAmount;
		String size;
		String type;
		int price;
		if (Teas.isEmpty()) {
			System.out.println("No Data!");
			System.out.printf("==============================================================\n", "No");
			System.out.print("Press enter to continue");scan.nextLine();
		} else {
			System.out.printf("==============================================================\n", "No");
			System.out.printf("|%-5s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "No", "Topping", "Sugar", "Size", "Base Price",
					"Type");
			System.out.printf("==============================================================\n", "No");
			for (Tea t : Teas) {
				topping = t.getTopping();
				sugarAmount = t.getSugarAmount();
				size = t.getSize();
				price = t.getPrice();
				type = t.getType();
				System.out.printf("|%-5d|%-10s|%-10s|%-10s|%-10d|%-10s|\n", no, topping, sugarAmount, size, price,
						type);
				System.out.printf("==============================================================\n", "No");
				no++;
			}
		}
		scan.nextLine();
	}

	public void addTea() {
		String topping;
		do {
			System.out.print("Input Topping [Cincau | Pudding]: ");
			topping = scan.nextLine();
		} while (!topping.equals("Cincau") && !topping.equals("Pudding"));

		String sugarAmount;
		do {
			System.out.print("Input Sugar Amount [No sugar | Half | Normal]: ");
			sugarAmount = scan.nextLine();
		} while (!sugarAmount.equals("No sugar") && !sugarAmount.equals("Half") && !sugarAmount.equals("Normal"));

		String size;
		do {
			System.out.print("Input Size [Regular | Large]: ");
			size = scan.nextLine();
		} while (!(size.equals("Regular")) && !(size.equals("Large")));

		String teaType;
		do {
			System.out.print("Input Tea Type [Milk Tea | Green Tea | Boba Tea]: ");
			teaType = scan.nextLine();
		} while (!teaType.equals("Milk Tea") && !teaType.equals("Green Tea") && !teaType.equals("Boba Tea"));

		if (teaType.equals("Milk Tea")) {
			makeMilkTea(topping, sugarAmount, size);
		} else if (teaType.equals("Green Tea")) {
			makeGreenTea(topping, sugarAmount, size);
		} else if (teaType.equals("Boba Tea")) {
			makeBobaTea(topping, sugarAmount, size);
		}
	}

	public void makeMilkTea(String topping, String sugarAmount, String size) {
		int basePrice = 0;
		do {
			try {
				System.out.print("Input Base Price [15000-25000]: ");
				basePrice = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (basePrice < 15000 || basePrice > 25000);

		int milk = -1;
		do {
			try {
				System.out.print("Input the amount of milk [in ml]: ");
				milk = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (milk < 0);

		MilkTea milktea = new MilkTea(topping, sugarAmount, size, "Milk Tea", basePrice, milk);
		Teas.add(milktea);
	}

	public void makeGreenTea(String topping, String sugarAmount, String size) {
		int basePrice = 0;
		do {
			try {
				System.out.print("Input Base Price [15000-25000]: ");
				basePrice = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (basePrice < 15000 || basePrice > 25000);

		int leaves = -1;
		do {
			try {
				System.out.print("Input the amount of tea leaves [in gr]: ");
				leaves = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (leaves < 0);

		GreenTea greentea = new GreenTea(topping, sugarAmount, size, "Green Tea", basePrice, leaves);
		Teas.add(greentea);
	}
	
	public void makeBobaTea(String topping, String sugarAmount, String size) {
		int basePrice = 0;
		do {
			try {
				System.out.print("Input Base Price [15000-25000]: ");
				basePrice = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (basePrice < 15000 || basePrice > 25000);

		int boba = -1;
		do {
			try {
				System.out.print("Input the amount of Boba [in gr]: ");
				boba = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}
		} while (boba < 0);

		BobaTea bobatea = new BobaTea(topping, sugarAmount, size, "Boba Tea", basePrice, boba);
		Teas.add(bobatea);
	}

	public void deleteTea() {
		viewTea();
		int no = 0;
		for (Tea tea : Teas) {
			no++;
		}
		if (no > 0) {
			int choose = -1;
			do {
				try {
					System.out.printf("\n\nChoose tea to be removed [1 - %d]: ", no);
					choose = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
				}
			} while (choose < 1 || choose > no);
			Teas.remove(choose - 1);
		}
	}
	
	public void buyTea() {
		viewTea();
		int no = 0;
		int firstNo = rand.nextInt(10);
		int secNo = rand.nextInt(10);
		int thirdNo = rand.nextInt(10);
		for (Tea tea : Teas) {
			no++;
		}
		if (no > 0) {
			int choose = -1;
			do {
				try {
					System.out.printf("\n\nChoose tea [1 - %d]: ", no);
					choose = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
				}
			} while (choose < 1 || choose > no);
			Tea t = Teas.get(choose-1);
			System.out.printf("\nTrancation ID : TR%d%d%d\n",firstNo, secNo, thirdNo);
			System.out.println("Name : " + t.getType() + t.getTopping());
			System.out.println("Base Price : " + t.getPrice());
			System.out.println("TAX 10% : " + 0.1*t.getPrice());
			System.out.println("Total Price : " + 1.1*t.getPrice());
			int totalPrice = (int) (1.1*t.getPrice());
			int pay = 0;
			do {
				try {
					System.out.printf("Input Payment [min %d]: ", totalPrice);
					pay = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
				}
			} while (pay < totalPrice); 
			
			if (pay > totalPrice) {
				System.out.println("Here's the change : " + (pay - totalPrice));
			}
		}
	}
}
