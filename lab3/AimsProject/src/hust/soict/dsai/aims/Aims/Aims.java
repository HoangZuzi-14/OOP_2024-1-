package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart.Cart;


import java.util.Arrays;
import java.util.Scanner;

public class Aims{
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Display all DVDs in the cart
        cart.displayCart();

        // Display total cost
        System.out.println("Total cost: $" + cart.totalCost());

        // Search for a DVD by title
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter DVD title to search: ");
        String searchTitle = scanner.nextLine();
        cart.filterByTitle(searchTitle);

        // Remove a DVD from the cart
        cart.removeDigitalVideoDisc(dvd2);

        // Display cart again after removal
        cart.displayCart();

        // Display total cost after removal
        System.out.println("Total cost after removal: $" + cart.totalCost());

        scanner.close();
    }
}
