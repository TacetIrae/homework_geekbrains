import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class homework_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> linlist = new LinkedList<Integer>();
        linlist.add(1);
        linlist.add(5);
        linlist.add(2);
        linlist.add(3);
        Iterator<Integer> iterator = linlist.iterator();
        Queue q = new Queue(5);
        while (iterator.hasNext()){
            q.enqueue(iterator.next());
        }
        System.out.println("The front element is: "+q.peek());
        q.dequeue();
        System.out.println("The front element is: "+q.peek());
        System.out.println("The queue size is: "+q.size());
        q.dequeue();
        q.dequeue();
        if (q.isEmpty()){
            System.out.println("The queue is empty");
        }else{
            System.out.println("The queue is not empty");
        }


    }
    static class Queue{
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int count;

        private int cap;

        Queue(int size){
            arr = new int [size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;

        }
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Underflow ");
                System.exit(-1);
            }
            int x = arr[front];
            System.out.println("Removing " + x);
            front = (front +1)% capacity;
            count --;
            return x;
        }
        public void enqueue(int item){
            if (isFull()){
                System.out.println("Overflow ");
                System.exit(-1);

            }
            System.out.println("Inserting " + item);
            rear = (rear+1)% capacity;
            arr[rear] = item;
            count ++;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                System.exit(-1);
            }return arr[front];

        }
        public int size(){
            return count;
        }
        public boolean isEmpty(){
            return (size()==capacity);
        }
        public boolean isFull(){
            return (size()==capacity);
        }

    }

}