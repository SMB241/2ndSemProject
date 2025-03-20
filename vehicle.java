package inheritance;

public class vehicle {
private String make;
private String model;
private String registrationNumber;

public vehicle(String make, String model, String registrationNumber){

    this.make = make;
    this.model=model;
    this.registrationNumber = registrationNumber;
    }

    public String getmake(){
        return make;
    }

    public String getmodel(){
        return model;
    }

    public String getregistrationNumber(){
        return registrationNumber;
    }
    
    public String setmake(){
        return make;
    }

    public String setmodel(){
        return model;
    }

    public void setregistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public void displayVehicleInfo(){
        System.out.println("Vehicle make: " + make);
        System.out.println("Vehicle mode: " + model);
        System.out.println("Registration number: " + registrationNumber);
    }
}