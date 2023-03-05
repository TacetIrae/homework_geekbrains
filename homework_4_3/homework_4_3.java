import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class homework_4_3{
    public static void main(String[] args) {
        LinkedList<Integer> linlist = new LinkedList<Integer>();
        linlist.add(1);
        linlist.add(5);
        linlist.add(2);
        linlist.add(3);
        Iterator<Integer> iterator = linlist.iterator();

        int sum = 0;
        int index = 0;
        while(iterator.hasNext()){
            sum += linlist.get(index);
            index ++;
            iterator.next();
        }
        System.out.println("The sum of a linked list is = " + sum);
        System.out.println("Full linked list:" + linlist.toString());

    }
}
