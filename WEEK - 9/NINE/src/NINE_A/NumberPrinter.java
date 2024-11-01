package NINE_A;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class NumberPrinter {
 public static void main(String[] args) {
 ExecutorService executor = Executors.newFixedThreadPool(5);
 for (int i = 1; i <= 15; i++) {
 final int number = i; 
 executor.submit(() -> printNumber(number));
 }
 executor.shutdown();
 }
 private static void printTwo(int number) {
 if (number % 2 == 0) {
 System.out.println("Divisible by 2: " + number);
 }
 }
 private static void printThree(int number) {
 if (number % 3 == 0) {
 System.out.println("Divisible by 3: " + number);
 }
 }
 private static void printFour(int number) {
 if (number % 4 == 0) {
 System.out.println("Divisible by 4: " + number);
 }
 }
 private static void printFive(int number) {
 if (number % 5 == 0) {
 System.out.println("Divisible by 5: " + number);
 }
 }
 private static void printNumber(int number) {
 printTwo(number);
 printThree(number);
 printFour(number);
 printFive(number);
 if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
 System.out.println("Number: " + number);
 }
 }
}
