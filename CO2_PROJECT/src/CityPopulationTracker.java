import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CityPopulationTracker {
    private Map<String, Integer> cityPopulationMap;

    public CityPopulationTracker() {
        this.cityPopulationMap = new HashMap<>();
    }

    // Add or update a city's population
    public void addOrUpdateCity(String city, int population) {
        cityPopulationMap.put(city, population);
        System.out.println("City added/updated: " + city + " with population: " + population);
    }

    // Remove a city
    public void removeCity(String city) {
        if (cityPopulationMap.containsKey(city)) {
            cityPopulationMap.remove(city);
            System.out.println("City removed: " + city);
        } else {
            System.out.println("City not found: " + city);
        }
    }

    // Get population of a specific city
    public Integer getCityPopulation(String city) {
        return cityPopulationMap.get(city);
    }

    // Get all cities in alphabetical order
    public Set<String> getAllCities() {
        return new TreeSet<>(cityPopulationMap.keySet());
    }

    // Display all cities and their populations
    public void displayAllCities() {
        if (cityPopulationMap.isEmpty()) {
            System.out.println("No cities in the tracker.");
        } else {
            System.out.println("City Population Data:");
            cityPopulationMap.forEach((city, population) -> 
                System.out.println(city + " -> " + population)
            );
        }
    }
}
