public class Drinks extends items {
    protected int volume;

    public Drinks(int Index, String name, int price, String measure, int quan, int volume){
        super(Index,name,price,measure,quan);
        this.volume = volume;
    }

    public int getVolume(){return volume;}

    public String getInfo(){
        return String.format("%s volume in:%d", super.getInfo(),getVolume());
    }
}
