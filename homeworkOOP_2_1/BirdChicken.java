public class BirdChicken extends AnimalBird implements AnimalBase {
    public BirdChicken(int height, int weight, String EyeColor, int altitude) {
        super(height, weight, EyeColor, altitude);
    }

    @Override
    public void printInfo() {
        System.out.printf("Height:%d\n" +
                "Weight:%d\n" +
                "Eye Color:%s\n" +
                "Altitude:%d", height,weight,EyeColor,altitude);

    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public String getEyeColor() {
        return null;
    }
}
