
    class Car extends Vehicle {
        private int numSeats;

        public Car(String make, String model, int year, int numSeats)
        {
            super(make, model, year);
            this.numSeats = numSeats;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", " + numSeats + " seater";
        }
    }

