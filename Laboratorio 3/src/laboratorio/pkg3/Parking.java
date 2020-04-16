package laboratorio.pkg3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

    public int CarCapacity;
    public int MotorcycleCapacity;
    public int BikeCapacity;
    public int CarPrice;
    public int MotorcyclePrice;
    public int BikePrice;
    public int NigthPrice;
    public int TenHours;
    
    Parking(int CarCapacity, int MotorcycleCapacity, int BikeCapacity, int CarPrice, int MotorcyclePrice,
            int BikePrice, int NigthPrice, int TenHours){
        this.CarCapacity=CarCapacity;
        this.MotorcycleCapacity=MotorcycleCapacity;
        this.BikeCapacity=BikeCapacity;
        this.CarPrice=CarPrice;
        this.MotorcyclePrice=MotorcyclePrice;
        this.BikePrice=BikePrice;
        this.NigthPrice=NigthPrice;
        this.TenHours=TenHours;
    }   
}
