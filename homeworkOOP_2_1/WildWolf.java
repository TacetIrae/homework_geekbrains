public class WildWolf implements AnimalBase,AnimalWild{

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void printInfo() {

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
