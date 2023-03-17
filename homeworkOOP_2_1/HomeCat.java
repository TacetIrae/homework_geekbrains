
public class HomeCat implements AnimalBase,AnimalHome{


    @Override
    public void NiceBoy() {
        System.out.println("Meow 'licks your hand'");
    }

    @Override
    public String getAnimalName() {
        return AnimalName;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public boolean isInjected() {
        return isInjected;
    }

    @Override
    public String getFurColor() {
        return FurColor;
    }

    @Override
    public String getDateBirth() {
        return DateBirth;
    }

    @Override
    public void sound() {
        System.out.println("Meow");

    }

    @Override
    public void printInfo() {
        System.out.printf("Height%d\n" +
                "Weight:%d\n" +
                "Eye Color:%s\n" +
                "Name:%s\n" +
                "Kind:%s\n" +
                "Injected:%b\n" +
                "Fur color%s\n" +
                "Date of birth:%s",height,weight,EyeColor,AnimalName,kind,isInjected,FurColor,DateBirth);

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
