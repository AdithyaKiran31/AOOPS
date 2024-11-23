import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CityPopulationTracker tracker = new CityPopulationTracker();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- City Population Tracker ---");
            System.out.println("1. Add or Update City");
            System.out.println("2. Remove City");
            System.out.println("3. Get City Population");
            System.out.println("4. View All Cities (Alphabetical)");
            System.out.println("5. Display All Cities and Populations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter population: ");
                    int population = scanner.nextInt();
                    tracker.addOrUpdateCity(city, population);
                    break;

                case 2:
                    System.out.print("Enter city name to remove: ");
                    city = scanner.nextLine();
                    tracker.removeCity(city);
                    break;

                case 3:
                    System.out.print("Enter city name: ");
                    city = scanner.nextLine();
                    Integer pop = tracker.getCityPopulation(city);
                    if (pop != null) {
                        System.out.println("Population of " + city + ": " + pop);
                    } else {
                        System.out.println("City not found: " + city);
                    }
                    break;

                case 4:
                    System.out.println("Cities in Alphabetical Order:");
                    tracker.getAllCities().forEach(System.out::println);
                    break;

                case 5:
                    tracker.displayAllCities();
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
