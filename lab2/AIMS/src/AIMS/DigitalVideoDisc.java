package AIMS;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor with all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Constructor with title only
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Getters for all attributes
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Method to display DVD information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Category: " + category + ", Director: " + director + 
                           ", Length: " + length + " mins, Cost: $" + cost);
    }

    // Method to compare DVDs by title
    public boolean hasTitle(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle);
    }
}
