public class WildWolf extends AnimalBase implements AnimalWild{

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void printInfo() {
        System.out.printf("Height%d\n" +
                "Weight:%d\n" +
                "Eye Color:%s\n" +
                "Living place%s\n" + "Living data%s",height,weight,EyeColor,livingPlace,livingDate);

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

    @Override
    public String getLivingPlace() {
        return livingPlace;
    }

    @Override
    public String getLivingDate() {
        return livingDate;
    }
}
