public class Vehicle {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println(name);
    }

    void sostav() {
        Wheel wheel1 = new Wheel("трехспецевое рулевое колесо");
        Door door1 = new Door("безрамочная дверь");
        wheel1.print();
        door1.print();

    }

    class Wheel {
        private String name;

        public Wheel(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        void print() {
            System.out.println(name);
        }

    }

    class Door {
        private String name;

        public Door(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        void print() {
            System.out.println(name);
        }
    }


}

class DemoVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Door door = new Vehicle().new Door("распашная дверь");
        Vehicle.Wheel wheel = new Vehicle().new Wheel("спортивный руль");
        vehicle.setName("cabriolet");

        System.out.print("Автомобиль : ");
        vehicle.print();
        System.out.println("состоит из: ");
        wheel.print();
        door.print();

        System.out.println("--------------- создадим обекты внутренних класов через метод внешнего класса ---------------");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("coupe");
        System.out.print("Автомобиль : ");
        vehicle1.print();
        System.out.println("состоит из: ");
        vehicle1.sostav();



    }

}
