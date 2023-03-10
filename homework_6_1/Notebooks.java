
public class Notebooks {

    private final String name;

    private final int amountRAM;
    private final String operatingSystem;
    private final int price;
    private final String model;

    private final String color;

    public Notebooks(String name, int amountRAM, String operatingSystem, int price, String model, String color) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model+
                ", цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }


    public int getPrice() {
        return price;
    }


    public String getModel() {
        return model;
    }
    public String getColor(){
        return color;
    }

}