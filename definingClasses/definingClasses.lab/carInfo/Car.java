package definingClasses.carInfo;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsepower());
    }
}


