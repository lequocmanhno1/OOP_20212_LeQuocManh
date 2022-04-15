
public class Order {
	public static final int	MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i =0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				   for(int j = i ; j < itemsOrdered.length -1; j++){
					   itemsOrdered[j] = itemsOrdered[j + 1];
				      }
			};
		}
		qtyOrdered--;
		System.out.println("The disc has been removed");
	}  
	
	public float totalCost() {
		float sum = 0;
		for (int i =0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}
