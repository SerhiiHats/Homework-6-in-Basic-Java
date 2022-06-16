package vehicleSpecification;

public class TestVehicleSpecification {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.Acura;
        System.out.println("----------- one car ----------");
        System.out.println("vehicle : " + vehicles.name() + " , цвет: " + vehicles.getColor() + " , цена автомобиля: " + vehicles.getPrice());

        System.out.println("----------- all of vehicle ----------");
        for (Vehicles v : Vehicles.values()){
            System.out.println(v.toString());
        }
    }
}
