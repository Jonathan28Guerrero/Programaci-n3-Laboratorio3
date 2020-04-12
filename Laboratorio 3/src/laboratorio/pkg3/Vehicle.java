package laboratorio.pkg3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static laboratorio.pkg3.VehicleInside.Vehicles;


public class Vehicle {
    public List VehiclesType= new ArrayList();
    public List VehiclesPlate= new ArrayList();
    public List CheckTimes= new ArrayList();
    public List DepartureTimes= new ArrayList();
    public List TotalTimes= new ArrayList();
    public List ParkingPrices= new ArrayList();
    public void AddVehicle(String Type, String VehiclePlate, LocalDateTime CheckTime){
        VehiclesType.add(Type);
        VehiclePlate=VehiclePlate.toUpperCase();
        VehiclesPlate.add(VehiclePlate);
        CheckTimes.add(CheckTime);
        DepartureTimes.add("No hay registro");
        TotalTimes.add("No hay registro");
        ParkingPrices.add("No hay registro");
    }
    public void VehicleOut(String Plate, LocalDateTime DepartureTime, int Value){
        Plate = Plate.toUpperCase();
        int n = VehiclesPlate.indexOf(Plate);
        DepartureTimes.set(n, DepartureTime);
        LocalDateTime Time1=(LocalDateTime) CheckTimes.get(n);
        LocalDateTime Time2=(LocalDateTime) DepartureTimes.get(n);
        float Time = Duration.between(Time1,Time2).toMinutes();
        TotalTimes.set(n, Time);
        ParkingPrices.add(n, Time*Value);
        Invoice(Plate);
    }
    public String GetType(String Plate){
        Plate = Plate.toUpperCase();
        int a = VehiclesPlate.indexOf(Plate);
        return(String)(VehiclesType.get(a));
    }
    public void Invoice(String Plate){
        Plate = Plate.toUpperCase();
        int b=VehiclesPlate.indexOf(Plate);
        JOptionPane.showMessageDialog(null,("Tipo de vehiculo: " + VehiclesType.get(b) +
                "\nPlaca: " + VehiclesPlate.get(b) +
                "\nTiempo total: " + TotalTimes.get(b) +
                "\nValor del parqueo: $" + ParkingPrices.get(b)), "Recibo de pago",1);
    }
}
