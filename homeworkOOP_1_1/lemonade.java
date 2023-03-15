public class lemonade extends Drinks {

    public lemonade(int Index, String name, int price, String measure, int quan, int volume){
        super(Index,name,price,measure,quan,volume);

    }
    public String getInfo(){
        return String.format("%s volume in:%d", super.getInfo(),getVolume());
    }
}
