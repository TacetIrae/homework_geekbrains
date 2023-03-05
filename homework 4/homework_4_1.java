import java.util.Iterator;
import java.util.LinkedList;

public class homework_4_1 {
    public static void main(String[] args){
        LinkedList <String> linlist = new LinkedList<String>();
        linlist.add("Abe");
        linlist.add("Eve");
        linlist.add("Dinara");
        linlist.add("Egor");

        Iterator<String> iterator = linlist.iterator();
        System.out.println("Normal order of the linked list");
        int i = 1;
        while(iterator.hasNext()){
            System.out.println(i+")"+iterator.next());
            i++;
        }
        System.out.println("Reversed order of the linked list:");
        Iterator desIterator = linlist.descendingIterator();
        int count = 1;

        while(desIterator.hasNext()){
            System.out.println(count +")" + desIterator.next());
            count ++;        }
    }
}