
    class Bike extends Vehicle {
        private String bikeType;

//Constructor that is used to initialize bike information.
        public Bike(String make, String model, int yom, String bikeType) {
            super(make, model, yom);
            this.bikeType = bikeType;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", " + bikeType + " bike.";
        }
    }

