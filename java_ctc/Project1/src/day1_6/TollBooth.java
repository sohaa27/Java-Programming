package day1_6;

public class TollBooth {
    private int totalCars;         // To hold the total number of cars
    private double totalCash;      // To hold the total amount of money collected

    // Constructor initializes totals to 0
    public TollBooth() {
        totalCars = 0;
        totalCash = 0.0;
    }

    // Method for a paying car
    public void payingCar() {
        totalCars++;
        totalCash += 0.50;
    }

    // Method for a non-paying car
    public void nopayCar() {
        totalCars++;
    }

    // Method to display totals
    public void display() {
        System.out.println("Total cars passed: " + totalCars);
        System.out.printf("Total cash collected: Rs. %.2f\n", totalCash);
    }

    // Main method to test the class
    public static void main(String[] args) {
        TollBooth booth = new TollBooth();

        // Simulating cars passing
        booth.payingCar();
        booth.payingCar();
        booth.nopayCar();
        booth.payingCar();

        // Displaying the result
        booth.display();
    }
}
