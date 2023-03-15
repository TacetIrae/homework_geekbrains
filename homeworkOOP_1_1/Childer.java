public class Childer extends items {

    protected int minAge;
    protected boolean allergic;

    public Childer(int Index, String name, int price, String measure, int quan, int minAge, boolean allergic){
        super(Index, name,price, measure, quan);
        this.minAge = minAge;
        this.allergic = allergic;
    }

    public int getMinAge(){return minAge;}
    public boolean isAllergic(){return isAllergic();}

    public String getInfo(){
        return String.format("%s expiary in:%s", super.getInfo(),getMinAge(),isAllergic());
    }

    @Override
    public String toString(){
        return "Индекс:" + Index +
                "\n Название:" + name +
                "\n Цена:" + price +
                "\n Ед изм:" + measure +
                "\n Кол-во:" + quantity +
                "\n Минимальный возраст:" +minAge+
                "\n Аллергичконость:" + allergic;
    }
}
