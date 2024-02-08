public class Vehicle
{
        private String make;
        private String model;
        private int yom;

        /*Constructor that is used to initialize vehicle information
        such as make, model and Year of manufacture (YOM)*/
        public Vehicle(String make, String model, int yom) {
            this.make = make;
            this.model = model;
            this.yom = yom;
        }


//Method used to get vehicle description
        public String getDescription() {
            return yom + " " + make + " " + model;
        }
    }

