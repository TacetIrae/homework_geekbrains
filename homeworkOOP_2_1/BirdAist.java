public class BirdAist extends AnimalBird implements AnimalBase{
    public BirdAist(int height, int weight, String EyeColor, int altitude) {
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
    public void sound(){
        System.out.println("Cr cr");
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getEyeColor() {
        return EyeColor;
    }
}
