import java.util.HashSet;
import java.util.Set;


public class shop {
    /*
    * Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения
А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
1.1 Срок годности
2. Напитки, содержащие следующие свойства:
2.1 Объём
3. Предметы гигиены, содержащие следующие свойства:
3.1 Количество штук в упаковке
4. Детские товары:
4.1 Минимальный возраст
4.2 Гипоаллергенность,
А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности
6. Лимонад
7. Хлеб, содержащий следующие свойство:
7.1 Тип муки
8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке
9. Маски
10. Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв
11. Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип
12. Соска
У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
*  в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
Реализовать в классе Program, метод выводящий все данные о товаре. Создать в
* Main все объекты товаров и проверить работу метода, созданного в классе Program*/

    public static void main(String[] args) {
        Set<ExpiaryProducts> setExpiaryProducts = new HashSet<>();
        setExpiaryProducts.add(new ExpiaryProducts(items.Index,"Хлеб черный",50,"grams",5,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Хлеб белый",80,"grams",2,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Хлеб серый",220,"grams",10,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Яйца",199,"grams",7,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Яйца",770,"grams",8,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Яйца",100,"grams",3,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Молоко",199,"ml",5,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Масло",299,"ml",53,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Молоко",99,"ml",12,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Кефир",79,"ml",21,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Сливки",499,"ml",1,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index++,"Йогурт",54,"ml",50,"12.2023"));
        setExpiaryProducts.add(new ExpiaryProducts(items.Index,"Сырок",30,"grams",3,"12.2023"));


        Set<Drinks> setDrinks = new HashSet<>();
        setDrinks.add(new Drinks(items.Index,"Coca-cola",100,"ml",10,500));
        setDrinks.add(new Drinks(items.Index,"Sprite",80,"ml",1,500));
        setDrinks.add(new Drinks(items.Index,"Fanta",90,"ml",80,500));
        setDrinks.add(new Drinks(items.Index,"Coca-cola",250,"ml",100,2000));
        setDrinks.add(new Drinks(items.Index,"Coca-cola",199,"ml",5,1000));
        setDrinks.add(new Drinks(items.Index,"Lemonade",100,"ml",5,500));
        setDrinks.add(new Drinks(items.Index,"Lemonade",120,"ml",3,250));
        setDrinks.add(new Drinks(items.Index,"Lemonade",140,"ml",1,1000));

        Set<Detox> setDetox = new HashSet<>();
        setDetox.add(new Detox(items.Index,"Туалетная бумага",100,"grams",10,4));
        setDetox.add(new Detox(items.Index,"Туалетная бумага",200,"grams",120,4));
        setDetox.add(new Detox(items.Index,"Туалетная бумага",300,"grams",1,4));
        setDetox.add(new Detox(items.Index,"Туалетная бумага",400,"grams",20,4));
        setDetox.add(new Detox(items.Index,"Прокладки",1000,"grams",11,40));
        setDetox.add(new Detox(items.Index,"Прокладки",1500,"grams",15,60));
        setDetox.add(new Detox(items.Index,"Прокладки",2000,"grams",12,50));

        Set<Childer> setChildren = new HashSet<>();
        setChildren.add(new Childer(items.Index,"Свистушка",500,"grams",4,1,false));
        setChildren.add(new Childer(items.Index,"Погремушка",500,"grams",5,3,true));
        setChildren.add(new Childer(items.Index,"Солдат",650,"grams",2,3,false));
        setChildren.add(new Childer(items.Index,"Ферма",10000,"grams",7,10,true));


        Set<diary> setDiary = new HashSet<>();
        setDiary.add(new diary(items.Index,"Молоко",199,"ml",5,"12.2023","2%"));
        setDiary.add(new diary(items.Index,"Масло",299,"ml",53,"12.2023","4%"));
        setDiary.add(new diary(items.Index,"Молоко",99,"ml",12,"12.2023","2%"));
        setDiary.add(new diary(items.Index,"Кефир",79,"ml",21,"12.2023","6%"));
        setDiary.add(new diary(items.Index,"Сливки",499,"ml",1,"12.2023","4%"));
        setDiary.add(new diary(items.Index,"Йогурт",54,"ml",50,"12.2023","3%"));
        setDiary.add(new diary(items.Index,"Сырок",30,"grams",3,"12.2023","2%"));

        Set<Bread> setBread = new HashSet<>();
        setBread.add(new Bread(items.Index,"Хлеб черный",50,"grams",5,"12.2023"));
        setBread.add(new Bread(items.Index,"Хлеб белый",80,"grams",2,"12.2023"));
        setBread.add(new Bread(items.Index,"Хлеб серый",220,"grams",10,"12.2023"));

        Set<eggs> setEggs = new HashSet<>();
        setEggs.add(new eggs(items.Index,"Яйца",199,"grams",7,"12.2023",10));
        setEggs.add(new eggs(items.Index,"Яйца",770,"grams",8,"12.2023",10));
        setEggs.add(new eggs(items.Index,"Яйца",100,"grams",3,"12.2023",10));

        Set<lemonade> setLemonade = new HashSet<>();
        setLemonade.add(new lemonade(items.Index,"Lemonade",100,"ml",5,500));
        setLemonade.add(new lemonade(items.Index,"Lemonade",120,"ml",3,250));
        setLemonade.add(new lemonade(items.Index,"Lemonade",140,"ml",1,1000));

        Set<toiletPaper> setToiletPapier = new HashSet<>();
        setToiletPapier.add(new toiletPaper(items.Index,"Туалетная бумага",100,"grams",10,4,3));
        setToiletPapier.add(new toiletPaper(items.Index,"Туалетная бумага",200,"grams",120,4,3));
        setToiletPapier.add(new toiletPaper(items.Index,"Туалетная бумага",300,"grams",1,4,4));
        setToiletPapier.add(new toiletPaper(items.Index,"Туалетная бумага",400,"grams",20,4,999));

        Set<Object> all = new HashSet<>();
        all.addAll(setExpiaryProducts);
        all.addAll(setChildren);
        all.addAll(setDetox);
        all.addAll(setDrinks);


        Program prog = new Program(all);
        prog.start();






    }
}

