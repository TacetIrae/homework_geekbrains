
public class diary extends ExpiaryProducts {

    protected String Fat;
    public diary(int Index, String name, int price, String measure, int quan, String expiary,String Fat) {
        super(Index, name, price, measure, quan, expiary);
        this.Fat = Fat;
    }
    public String getFat(){return Fat;}

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
                "\n Срок годности:" +expiary+
                "\n Жирность:" + Fat;
    }
}