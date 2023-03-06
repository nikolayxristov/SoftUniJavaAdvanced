package definingClasses.carConstructors;

public class Car {

    private String brand;
    private String model;
    private int hp;

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.hp = -1;
    }

    public Car(String brand, String model, int hp) {
        this(brand);

        this.model = model;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHp());
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHp() {
        return this.hp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
