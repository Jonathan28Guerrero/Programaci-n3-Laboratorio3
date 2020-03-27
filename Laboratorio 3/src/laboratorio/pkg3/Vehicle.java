package laboratorio.pkg3;

import java.time.LocalDateTime;

public class Vehicle {
    public String VehiclePlate;
    public LocalDateTime CheckTime;
    public LocalDateTime DepartureTime;
    public float TotalTime;
    public int ParkingPrice;
    Vehicle(String VehiclePlate, LocalDateTime CheckTime){
        this.VehiclePlate=VehiclePlate;
        this.CheckTime=CheckTime;
    }
    
}
