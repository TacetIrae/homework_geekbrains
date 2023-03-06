import java.util.*;


public class homework_5_2 {
    public static void main(String[] args) {
        String[] fullNames = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        LinkedList<String> list = new LinkedList<>();
        for(String first_name : fullNames){
            list.add(first_name.split(" ")[0]);
        }
        System.out.println(list);

        Map<String,Integer> map = new TreeMap<String,Integer>();
        for (String firstName:list){
            if(map.containsKey(firstName)){
                map.put(firstName,map.get(firstName)+1);
            }else map.put(firstName,1);
        }
        System.out.println(map);

        Map<Integer,List<String>> Map_values = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            if(Map_values.containsKey(entry.getValue())){
                List<String> list1 = Map_values.get(entry.getValue());
                list1.add(entry.getKey());
            }else{
                List<String> list1 = new ArrayList<>();
                list1.add(entry.getKey());
                Map_values.put(entry.getValue(),list1);
            }
        }
        System.out.println(Map_values);
    }
}
