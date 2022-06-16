package vehicleSpecification;

public enum Vehicles {
    Acura("White", 35700),
    Audi("Grey", 57200),
    BMW("Black", 43100),
    Cadillac("Red", 31500),
    Honda("Blue", 29700),
    Hyundai("Sand", 25500),
    Tayota("Black", 31999),
    Tesla("White", 79900),
    ;
private int price;
private String color;

    Vehicles(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "автомобиль марки : " + this.name() + ", цвет: " + color +
                " , цена автомобиля: " + price;
    }
}
