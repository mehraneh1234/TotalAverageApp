
package totalaverageapp.java;
/**
 * Mehraneh Hamedani - 30062786 - 04/04/2023
 * AT2- Activity6 Task A
 */
public class TotalAverageCalculator {
    // Define an array
    int[] arrayNumbers;
    // Define a method with input int array and int output
    public int getTotal(int[] nos){
        // Assign the argument array to the local array
        arrayNumbers = nos;
        // Declare a varible as an int which is assigned zero
        int total = 0;
        // Declare a for loop to all indices of the array to
        // calculate the sum of them
        for (int i = 0; i < arrayNumbers.length; i++){
            total += arrayNumbers[i];
        }
        // return the output
        return total; 
    }
    // Define a method with intput int array and output as double 
    public double getAverage(int[] nos){
        // Assign the argument array to the local array
        arrayNumbers = nos;
        // Declare variables
        double avg = 0.0;
        int total = 0;
        // Declare a for loop to all indices of the array to
        // calculate the sum of them
        for (int i = 0; i< arrayNumbers.length; i++){
            total += arrayNumbers[i];
        }
        // Calculate average numbers then assign it to the variable
        avg = total / (double)arrayNumbers.length;
        // Return the output
        return avg;
    }
}
