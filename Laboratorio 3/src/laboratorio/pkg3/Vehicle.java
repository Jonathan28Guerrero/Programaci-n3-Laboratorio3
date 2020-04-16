package laboratorio.pkg3;
import java.awt.Window;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Vehicle {
    
    public List VehiclesType= new ArrayList();
    public List VehiclesPlate= new ArrayList();
    public List CheckTimes= new ArrayList();
    public List DepartureTimes= new ArrayList();
    public List TotalTimes= new ArrayList();
    public List ParkingPrices= new ArrayList();
    public float Total=0;


    public void AddVehicle(String Type, String VehiclePlate, LocalDateTime CheckTime){
       
        VehiclesType.add(Type);
        VehiclePlate = VehiclePlate.toUpperCase();
        VehiclesPlate.add(VehiclePlate);
        CheckTimes.add(CheckTime);
        DepartureTimes.add("No hay registro");
        TotalTimes.add("No hay registro");
        ParkingPrices.add(0);
        
    }
    public void VehicleOut(String Plate, LocalDateTime DepartureTime, int Value, int NigthPrice, int TenHours){
        try{
            Plate = Plate.toUpperCase();
            long NigthPriceVehicle = 0;
            int n = VehiclesPlate.indexOf(Plate);
            DepartureTimes.set(n, DepartureTime);
            LocalDateTime Time1=(LocalDateTime) CheckTimes.get(n);
            LocalDateTime Time2=(LocalDateTime) DepartureTimes.get(n);
            LocalDateTime NigthTime= LocalDateTime.of(Time1.getYear(),Time1.getMonth(),Time1.getDayOfMonth(),18,00);
            LocalDateTime LimitTime= LocalDateTime.of(Time1.getYear(),Time1.getMonth(),Time1.getDayOfMonth(),22,00);
            if(Time2.isAfter(LimitTime)){
                JOptionPane.showMessageDialog(null, "Parqueadero cerrado");
                
            }
            if(Time2.isAfter(NigthTime) && Time1.isBefore(NigthTime))
                NigthPriceVehicle = Duration.between(NigthTime,Time2).toMinutes()* NigthPrice;
            else if (Time2.isAfter(NigthTime) && Time1.isAfter(NigthTime))
                NigthPriceVehicle = Duration.between(Time1,Time2).toMinutes()* NigthPrice;
            float Time = Duration.between(Time1,Time2).toMinutes();
            TotalTimes.set(n, Time);
            if(Time>=600)
                ParkingPrices.set(n, TenHours);
            else
                ParkingPrices.set(n, (Time*Value) + NigthPriceVehicle);
            Invoice(Plate);
            Total = Total + (float)ParkingPrices.get(n);
        }
        finally{}
    }
    public String GetType(String Plate){
                Plate = Plate.toUpperCase();
        int a = VehiclesPlate.indexOf(Plate);
        try{
            return(String)(VehiclesType.get(a));
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Vehiculo inexistente");
            return "null";
        }
    }
    public void Invoice(String Plate){
        Plate = Plate.toUpperCase();
        int b=VehiclesPlate.indexOf(Plate);
        JOptionPane.showMessageDialog(null,("Tipo de vehiculo: " + VehiclesType.get(b) +
                "\nPlaca: " + VehiclesPlate.get(b) +
                "\nFecha y hora de entrada: " + CheckTimes.get(b) +
                "\nFecha y hora de salida: " + DepartureTimes.get(b) +
                "\nTiempo total: " + TotalTimes.get(b) +
                "\nValor del parqueo: $" + ParkingPrices.get(b)), "Recibo de pago",1);
    }
    
    public String[][] Table(){
        String matriz[][] = new String[VehiclesType.size()][5];
        for (int i = 0 ; i <VehiclesType.size() ; i++){
            matriz[i][0]=(String) VehiclesType.get(i); 
            matriz[i][1]=(String) VehiclesPlate.get(i);
            matriz[i][2]=(String) CheckTimes.get(i);
            matriz[i][3]=(String) ParkingPrices.get(i);
        }
        return matriz;
    } 
    
}
