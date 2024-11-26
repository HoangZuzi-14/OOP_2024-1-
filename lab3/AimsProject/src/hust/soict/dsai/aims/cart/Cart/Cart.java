package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[20];
    private int qtyOrdered = 0;

    // Method to add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("Disc not found in the cart.");
    }

    // Method to display all DVDs in the cart
    public void displayCart() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Cart contains the following DVDs:");
        for (int i = 0; i < qtyOrdered; i++) {
            itemsOrdered[i].displayInfo();
        }
    }

    // Method to filter DVDs by title
    public void filterByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].setTitle(title)) {
                System.out.println("Found DVD in cart:");
                itemsOrdered[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD with title \"" + title + "\" found in the cart.");
        }
    }
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}	
		return totalCost;
	}
	
	public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];
		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}
		return listOrdered;
	}
	
	 public void print() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 System.out.println("Total cost: " + totalCost());
				 break;
			 }
			 else {
				 System.out.println(disc.getID() + ". " + disc.toString());
			 }		 
		 }
	 }
	 
	 public void idSearch(int id) {
		 boolean found = false;
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 else if (disc.getID() == id) {
				 System.out.println("found: " + disc.toString());
				 found = true;
				 break;
			 } 
		 }
		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }	
	 
	 public void titleSearch(String title) {
		 boolean found = false;
		 String lowercaseTitle = title.toLowerCase();
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 String[] keywords = lowercaseTitle.split(" ");
			 String lowercaseDVDTitle = disc.getTitle().toLowerCase();
			 for (String keyword : keywords) {
			        if (lowercaseDVDTitle.contains(keyword)) {
			            found = true;
			            System.out.println("found: " + disc.toString());
			            break;
			        }
			    }
		 }

		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }
}