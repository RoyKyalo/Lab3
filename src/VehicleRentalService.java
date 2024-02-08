public class VehicleRentalService
{
    // Renting method for cars
    public void rentVehicle(String make, String model, int yom, int duration, boolean insuranceInclusive)
    {
        Car car = new Car(make, model, yom, 4);
        double rentalCost = calculateRentalCost(duration, insuranceInclusive);
        System.out.println("The Car rented is : " + car.getDescription());
        System.out.println("The total cost of the service is: Kshs " + rentalCost);
    }

    // Renting method for bikes
    public void rentVehicle(String make, String model, int year, String bikeType, int duration, boolean insuranceIncluded)
    {
        Bike bike = new Bike(make, model, year, bikeType);
        double rentalCost = calculateRentalCost(duration, insuranceIncluded);
        System.out.println("The Bike rented is: " + bike.getDescription());
        System.out.println("The total cost of the service is: Kshs" + rentalCost);
    }

    // Renting method for scooters
    public void rentVehicle(String make, String model, int yom, int engineCapacity, int duration, boolean insuranceInclusive)
    {
        Scooter scooter = new Scooter(make, model, yom, engineCapacity);
        double rentalCost = calculateRentalCost(duration, insuranceInclusive);
        System.out.println("The Scooter rented is : " + scooter.getDescription());
        System.out.println("The total cost of the service is: Kshs " + rentalCost);
    }

    // Helper method to calculate rental cost
    private double calculateRentalCost(int duration, boolean insuranceInclusive) {
        double baseCostPerDay = 5000;
        double insuranceCostPerDay = 1000;
        double totalCost = baseCostPerDay * duration;

        if (insuranceInclusive) {
            totalCost += insuranceCostPerDay * duration;
        }

        return totalCost;
    }
}