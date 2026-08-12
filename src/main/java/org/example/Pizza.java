package org.example;

public class Pizza {

    // Shared by all pizzas
    private static final String name = "Java Pizza";

    // Instance attributes
    private final int orderID;
    private String size;
    private int numberOfSlices;

    // Shared by all Pizza objects
    private static int count = 0;

    // Constructor 1: ID only
    // Default: Medium pizza, 8 slices
    public Pizza(int orderID) {
        this(orderID, "Medium pizza", 8);
    }

    // Constructor 2: ID + size + slices
    public Pizza(int orderID, String size, int numberOfSlices) {
        this.orderID = orderID;
        this.size = size;
        this.numberOfSlices = numberOfSlices;

        count++;
    }

    // Setter for number of slices
    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    // Display pizza information
    public void display() {
        System.out.println(
                String.format(
                        "[P%03d] %s, %d slices — %s",
                        orderID,
                        size,
                        numberOfSlices,
                        name
                )
        );
    }

    // Get total number of pizzas
    public static int getCount() {
        return count;
    }
}