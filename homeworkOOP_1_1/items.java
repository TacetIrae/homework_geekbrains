import java.util.Random;
public class items {
    protected static int Index;
    protected static Random r;
    protected String name;
    protected int price;
    protected int quantity;
    protected String measure;

    static {
        items.Index = 0;
        items.r = new Random();
    }

    public items(int index, String name, int price, String measure, int quantity){
        this.getIndex();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }

    public String getInfo(){
        return (String.format("Index:%d Name:%s \n Price:%d \nQuantity:%d\n Measure:%s",++Index, this.name,this.price,this.quantity,this.measure));
    }
    public String getName(){return name;}
    public int getPrice(){return price;}
    public int getQuantity(){return quantity;}
    public String getMeasure(){return measure;}
    protected int getIndex(){return Index++;}


}
