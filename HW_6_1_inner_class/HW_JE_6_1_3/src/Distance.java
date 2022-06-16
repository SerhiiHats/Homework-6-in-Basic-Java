import java.util.Scanner;

public class Distance {
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void print() {
        System.out.println(distance + " m. = " + Converter.metrToKilometr(distance) + " km");
        System.out.println(distance + " m. = " + Converter.metrToMili(distance) + " ml");
    }

    static class Converter {

        static double metrToKilometr(double distance) {
           return distance / 1000;

        }

        static double metrToMili(double distance) {
            return distance / 1609.35;
        }
    }

}

class DistanceDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keyOutZikl = true;
        Distance distanceOfconvert = new Distance();

        while (keyOutZikl) {
            while (keyOutZikl) {
                System.out.println("Введите растояние в метрах для конвертации");
                if (scanner.hasNextDouble()) {
                    distanceOfconvert.setDistance(scanner.nextDouble());
                    keyOutZikl = false;
                } else {
                    System.out.println("Данные введены некоректно");
                    scanner.nextLine();
                }
            }

            System.out.println("Конвертируем : " + distanceOfconvert.getDistance() + " m.:");
            distanceOfconvert.print();

            System.out.println("Хотите продолжить? Да - Y / Нет - любой символ + Enter");
            if (scanner.next().equalsIgnoreCase("Y")) {
                keyOutZikl = true;
            }
        }
        scanner.close();
        System.out.println("Конец программы");
    }
}
