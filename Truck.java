package inheritance;

public class Truck extends vehicle{
        private double cargoCapacity;

        public Truck(String make, String model, String registrationNumber, double cargoCapacity) {
            super(make, model, registrationNumber);
            this.cargoCapacity = cargoCapacity;
        }   

        public double getcargoCapacity(){
            return cargoCapacity;    
        }

        public void setcargoCapacity(double cargoCapacity){
            this.cargoCapacity=cargoCapacity;
        }

        @Override
        public void displayVehicleInfo(){
            super.displayVehicleInfo();
            System.out.println("Cargo Capacity (tons): " + cargoCapacity);
        }
}
