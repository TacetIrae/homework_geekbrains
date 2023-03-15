public class Bread extends ExpiaryProducts{


    public Bread(int Index, String name, int price, String measure, int quan, String expiary){
        super(Index, name,price, measure, quan,expiary);
    }

    public String getInfo(){
        return String.format("%s expiary in:%s", super.getInfo(),getExpiary());
    }

    @Override
    public String toString(){
        return "Индекс:" + Index +
                "\n Название:" + name +
                "\n Цена:" + price +
                "\n Ед изм:" + measure +
                "\n Кол-во:" + quantity +
                "\n Срок годности:" + expiary;
    }
}
