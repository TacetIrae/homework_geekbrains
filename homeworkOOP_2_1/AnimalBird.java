import java.util.Scanner;

public abstract class AnimalBird implements AnimalBase {

    protected Scanner scanner = new Scanner(System.in);
    protected int altitude;
    @Override
    public void sound() {

    }
    public void flight(int altitude){
        System.out.println("Im flight on"+altitude+" above the ground");
    }
    public AnimalBird(int height, int weight, String EyeColor,int altitude){
    }
    public int getAltitude(){
        scanner = new Scanner(System.in);
        System.out.println("Enter Altitude");
        return altitude = scanner.nextInt();
    }

}
