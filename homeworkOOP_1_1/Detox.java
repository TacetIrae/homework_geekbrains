public class Detox extends items{
    protected int number;

    public Detox(int Index, String name, int price, String measure, int quan, int number){
        super(Index, name,price, measure, quan);
        this.number = number;
    }

    public int getNumber(){return number;}

    public String getInfo(){
        return String.format("%s  Кол-во в упаковке:%s", super.getInfo(),getNumber());
    }

    @Override
    public String toString(){
        return "Индекс:" + Index +
                "\n Название:" + name +
                "\n Цена:" + price +
                "\n Ед изм:" + measure +
                "\n Кол-во:" + quantity +
                "\n Количесво в упаковке:" +number;
    }

}
