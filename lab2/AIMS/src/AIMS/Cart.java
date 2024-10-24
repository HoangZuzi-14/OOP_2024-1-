package AIMS;

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

    // Method to calculate the total cost of the DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
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
            if (itemsOrdered[i].hasTitle(title)) {
                System.out.println("Found DVD in cart:");
                itemsOrdered[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD with title \"" + title + "\" found in the cart.");
        }
    }
}
