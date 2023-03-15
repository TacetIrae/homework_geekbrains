public class toiletPaper extends Detox {
    protected int layers;
    public toiletPaper(int Index, String name, int price, String measure, int quan, int number,int layers){
        super(Index, name,price, measure, quan,number);
        this.layers = layers;
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
                "\n Количесво в упаковке:" +number+
                "\n Слоев:"+layers;
    }

}
