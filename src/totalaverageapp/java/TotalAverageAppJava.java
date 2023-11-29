package totalaverageapp.java;
/**
 *Mehraneh Hamedani - 30062786 - 04/04/2023
 * AT2- Activity6 Task A
 */
public class TotalAverageAppJava {

    public static void main(String[] args) {
        // Create an object of the class
        TotalAverageCalculator tac = new TotalAverageCalculator();
        // Assign some numbers to an array
        int[] numbers = {10, 5, 6, 7, 89};
        // Call the method of other class to calculate total numbers then assign
        // the result to an int variable
        int total = tac.getTotal(numbers);
        // Call the method of other class to calculate average numbers then 
        // assign the result to a double variable
        double average = tac.getAverage(numbers);
        // Display the result of total and average of the numbers in the array
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
    
}
