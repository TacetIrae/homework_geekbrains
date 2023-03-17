import java.util.*;

public class Program {

    private static Scanner scanner = new Scanner(System.in);
    protected Set<Object> Items;

    protected List<Criterion> criterionList = new ArrayList<>();

    public void printList(){
        for (Object item:Items){
            if(isCorrect((items) item)){
                System.out.println(item);
            }
        }
    }
    public boolean isCorrect(items item){
        for(Criterion criterion: criterionList){
            Object value;
            switch(criterion.property){
                case"Index" -> value = item.getIndex();
                case"name" -> value = item.getName();
                case"price"-> value = item.getPrice();
                case"measures"-> value = item.getMeasure();
                case"quantity"-> value = item.getQuantity();
                default -> {
                    continue;
                }
            }
            if (criterion.value!= null&&!criterion.value.equals(value)){
                return false;
            }
            if(criterion.maxValue != null && criterion.maxValue<Double.parseDouble(Objects.toString(value))){
                return false;
            }
            if(criterion.minValue!= null&& criterion.minValue>Double.parseDouble(Objects.toString(value))){
                return false;
            }
        }
        return true;
    }
    public Program (Set<Object> Items){
        scanner = new Scanner(System.in);
        this.Items = Collections.unmodifiableSet(Items);
    }


    public List<String> propertiesForFilters(){
        List<String> list = new ArrayList<>();
        list.add("Index");
        list.add("Name");
        list.add("Price");
        list.add("Еденица измерения");
        list.add("Количество");

        return list;


    }
    public String getOperations(){
        String text = """
                Выберите критерию:\s
                1) Добавить критерию\s
                2) Вывести список\
                3)Завершить""";
        return text;
    }

    public int getCtiteria(){
        StringBuilder text = new StringBuilder("Введите цифру, соответствующую необходимому критерию: ");
        List<String> properties = propertiesForFilters();
        for(int i = 0; i<properties.size(); i++){
            text.append("\n").append(i+1).append(". ").append(getPropertyDescribtion(properties.get(i)));

        }
        System.out.println(text);
        return scanner.nextInt();
    }
    public String getPropertyDescribtion(String property){
        Map<String,String> descriptionProperties = descriptionProperties ();
        return  descriptionProperties.get(property);
    }
    public Map<String,String> descriptionProperties(){
        Map<String,String> map = new HashMap<>();
        map.put("index","Индекс");
        map.put("name","Имя");
        map.put("price","Цена");
        map.put("measure","Еденица измерения");
        map.put("quantity","Количество");
        return map;
    }
    public Set<String> quantitaiveSelection(){
        Set<String> set = new HashSet<>();
        set.add("price");
        set.add("quantity");
        return set;
    }
    public void start(){
        boolean flag = true;
        while(flag){
            String operation = getOperations();
            switch (operation){
                case "3" ->{
                    flag = false;
                    scanner.close();
                }
                case "1"-> {
                    int criterion = getCtiteria();
                    List<String> properties = propertiesForFilters();
                    if(criterion -1<0|| criterion -1 > properties.size()-1){
                        System.out.println("Введено некоректное значение");
                        continue;
                    }
                    String property = properties.get(criterion-1);
                    Criterion criterionObkect;
                    try{
                        if(quantitaiveSelection().contains(property)){
                            criterionObkect = Criterions.startGettinh(scanner,property,true);
                        }else{
                            criterionObkect = Criterions.startGettinh(scanner,property,false);
                        }
                    }catch (Exception e){
                        System.out.println("Ошибка при вводе критерия");
                        continue;
                    }
                    if(criterionObkect!= null){
                        System.out.println("Критерий добавлен");

                    }
                }
            }
        }
    }
}
class Criterions{
    Object value;
    Integer minValue;
    Integer maxValue;
    boolean isQuantative;
    String property;

    public Criterions(String property, boolean isQuantative, Object value, Integer minValue, Integer maxValue){
        this.property = property;
        this.isQuantative = isQuantative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    public static Criterion startGettinh(Scanner scanner, String property,boolean isQuantative){
        if(isQuantative){
            String quest = """
                    Тип критерии:\s
                    1) Значения
                    2) Меньше\s
                    3)Больше\s
                    4)Интервал\s""";
            System.out.println(quest);
            String text = scanner.next();
            Criterion criterion= null;

            switch (text){
                case "1" ->{
                    System.out.println("Введите значение поиска:");
                    int getValue = scanner.nextInt();
                    criterion = new Criterion(property,true,getValue,null,null);


                }
                case "2" ->{
                    System.out.println("Введите предельное число");
                    int getValue = scanner.nextInt();
                    criterion = new Criterion(property,
                            true,
                            null,
                            (Double) null,
                            (double) getValue);

                }
                case "3" ->{
                    System.out.println("Введите минамальное число");
                    int getValue = scanner.nextInt();
                    criterion= new Criterion(property,true,null, (double) getValue, (Double) null);

                }
                case "4"->{
                    System.out.println("Мин предел");
                    int getMin = scanner.nextInt();
                    System.out.println("Макс предел");
                    int getMax = scanner.nextInt();
                    criterion = new Criterion(property,true, null, (double) getMin, (double) getMax);
                }
            }
            return criterion;
        }
        System.out.println("Введите значение поиска");
        String getValue = scanner.next();
        return new Criterion(property,false,getValue,null,null);
    }
}