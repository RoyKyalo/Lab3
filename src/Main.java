public class Main
{
    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        // Example rental scenarios

        //renting a car
        rentalService.rentVehicle("Toyota", "Camry", 2020, 5, true);

        //renting a bike
        rentalService.rentVehicle("Mercedes", "CBR00R", 2021, "sports", 3, false);

       //renting a scooter
        rentalService.rentVehicle("Yamaha", "Sprinter", 2019, 100, 7, true);
    }
}


