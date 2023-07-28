
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class WaterTracker {

    private ArrayList<Double> waterConsumptions;
    private double waterQualityRating;
    private double sanitationCleanlinessRating;
    public WaterTracker() {
        waterConsumptions = new ArrayList<>();
        waterQualityRating = 0.0;
        sanitationCleanlinessRating = 0.0;
    }
    public void addWaterConsumption(double amount) {
        waterConsumptions.add(amount);
    }
    public double getTotalWaterConsumption() {
        double total = 0.0;
        for (double consumption : waterConsumptions) {
            total += consumption;
        }
        return total;
    }
    public double getAverageWaterConsumption() {
        double total = getTotalWaterConsumption();
        return total / waterConsumptions.size();
    }

    public double getMaxWaterConsumption() {
        return Collections.max(waterConsumptions);
    }
    public double getMinWaterConsumption() {
        return Collections.min(waterConsumptions);
    }
    public void provideWaterQualityFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please rate the water quality (1-10):" );
        waterQualityRating = scanner.nextDouble();
        scanner.nextLine();
    }
    public void provideSanitationCleanlinessFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please rate the sanitation cleanliness(1-10): ");
        sanitationCleanlinessRating = scanner.nextDouble();
        scanner.nextLine();
    }
    public void clearData() {
        waterConsumptions.clear();
        waterQualityRating = 0.0;
        sanitationCleanlinessRating = 0.0;
    }
    public void displayStatistics()  {
        System.out.println("water consumption statics ");
        System.out.println(".........................");
        System.out.println("Total water consumption :" + getTotalWaterConsumption());
        System.out.println("Average Water Consumption" + getAverageWaterConsumption());
        System.out.println("Maximum Water Consumption"+ getMaxWaterConsumption());
        System.out.println("Minimum Water Consumption" + getMinWaterConsumption());
        System.out.println("Water Quality Rating" + waterQualityRating);
        System.out.println("sanitation Cleanliness Rating"+ sanitationCleanlinessRating);
    }
}

