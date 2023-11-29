# TotalAverageApp
Write a program that calculates the total and the average of int numbers.
o First, create a class named TotalAverageCalculator that contains two methods:
• public int getTotal(int[] nos)
o It calculates the total of the given numbers in the array and returns it as int. 
• public double getAverage(int[] nos)
o It calculates the average of the given numbers in the array and returns it as 
double.
o Write a main class, TotalAverageApp.java, that uses the two methods defined above.
 A sample main class.
public static void main(String[] args) {
 TotalAverageCalculator tac = new TotalAverageCalculator();
 
 int[] numbers = {10, 5, 6, 7, 89};
 
 int total = tac.getTotal(numbers);
 double average = tac.getAverage(numbers);
 
 System.out.println("Total: " + total);
 System.out.println("Average: " + average);
}
 A sample result.
Total: 117
Average: 23.
