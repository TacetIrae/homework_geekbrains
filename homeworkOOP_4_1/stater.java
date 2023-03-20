public class stater {
    public static void main(String[] args) {
        // Создание массива целых чисел
        DynamicArray<Integer> intArr = new DynamicArray<>();
        intArr.insert(10);
        intArr.insert(20);
        intArr.insert(5);
        intArr.insert(40);
        intArr.insert(30);
        System.out.println("Длина массива целых чисел: " + intArr.getLength());
        System.out.println("Массив целых чисел до сортировки:");
        intArr.printArray();
        intArr.bubbleSort();
        System.out.println("Массив целых чисел после сортировки пузырьком:");
        intArr.printArray();
        intArr.insertionSort();
        System.out.println("Массив целых чисел после сортировки вставками:");
        intArr.printArray();




    }
}