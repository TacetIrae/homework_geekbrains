import java.util.HashMap;
import java.util.Map;

public class functions {
    private Map<String, String> map = new HashMap<>();

    void add (String name, String phone){
        map.put(name,phone);
    }
    void addPhone(String name,String anotherPhone){
        map.put(name,map.get(name) + " / " + anotherPhone);

    }


    void print(String name){
        for (Map.Entry entry: map.entrySet()){
            if(entry.getKey().equals(name)){
                System.out.println(entry);
            }
        }
    }

}
