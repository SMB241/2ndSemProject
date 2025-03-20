package inheritance;

import java.util.Scanner;

public class Register{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("What Vehicle do you want to enter [1 - Car | 2 = Truck]: " );
        int choice = s.nextInt();
        if (choice == 1){
            System.out.println("Enter Make: ");
            String Make = s.nextLine();

            System.out.println("Enter model: ");
            String model = s.nextLine();

            System.out.println("Enter Registration Number: ");
            String registrationNumber = s.nextLine();

            System.out.println("Number of doors: ");
            int numberOfDoors = s.nextInt();

            Car car1 = new Car(Make, model, registrationNumber, numberOfDoors);
            car1.displayVehicleInfo();
        }else if(choice  == 2){
            System.out.println("Enter Make: ");
            String make = s.nextLine();

            System.out.println("Enter model: ");
            String Model = s.nextLine();

            System.out.println("Enter Registration Number: ");
            String RegistrationNumber = s.nextLine();

            System.out.println("Enter Cargo Capacity: ");
            double cargoCapacity = s.nextDouble();

            Truck truck1 = new Truck(make, Model, RegistrationNumber, cargoCapacity);

            truck1.displayVehicleInfo();
        } else {
            System.out.println("Invalid Option");
        }
    }
}
