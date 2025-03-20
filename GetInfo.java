package inheritance;

import java.util.Scanner;

public class GetInfo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("What Vehicle do you want to enter [1 - Car | 2 = Truck]: " );
        String choice = s.nextLine();
        
        if (choice == "1"){
            System.out.println("Enter Make: ");
            String Make = s.nextLine();

            System.out.println("Enter model: ");
            String model = s.nextLine();

            System.out.println("Enter Registration Number: ");
            String registrationNumber = s.nextLine();

            System.out.println("Number of doors: ");
            int numberOfDoors = s.nextInt();
            
            
            System.out.println("Number of doors: " + numberOfDoors);

            Car car1 = new Car(Make, model, registrationNumber);
            car1.displayVehicleInfo();
        }else if(choice == "2"){
            System.out.println("Enter Make: ");
            String Make = s.nextLine();

            System.out.println("Enter model: ");
            String model = s.nextLine();

            System.out.println("Enter Registration Number: ");
            String registrationNumber = s.nextLine();

            System.out.println("Enter Cargo Capacity: ");
            double cargoCapacity = s.nextDouble();

            Truck truck1 = new Truck(Make, model, registrationNumber);

            truck1.displayVehicleInfo();
            System.out.println("Payload Capacity; " + cargoCapacity);
        }
    }
}
