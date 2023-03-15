public class eggs extends ExpiaryProducts{
    protected int countEggs;
    public eggs(int Index, String name, int price, String measure, int quan, String expiary, int countEggs){
        super(Index, name,price, measure, quan,expiary);
        this.countEggs = countEggs;

    }
    public int getCountEggs(){return countEggs;}

    public String getInfo(){
        return String.format("%s expiary in:%s кол-во в упаковке:%d", super.getInfo(),getExpiary(),getCountEggs());
    }

    @Override
    public String toString(){
        return "Индекс:" + Index +
                "\n Название:" + name +
                "\n Цена:" + price +
                "\n Ед изм:" + measure +
                "\n Кол-во:" + quantity +
                "\n Срок годности:" +expiary+
                "\n Кол-во в упаковке"+ countEggs;
    }
}
