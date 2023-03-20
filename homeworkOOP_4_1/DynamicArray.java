import java.util.Arrays;

public class DynamicArray<T> {

    private T[] array;
    private int length;
    public DynamicArray() {
        this.array = (T[]) new Object[0];
        this.length = 0;
    }

    public DynamicArray(T[] initialArray) {
        this.array = Arrays.copyOf(initialArray, initialArray.length);
        this.length = initialArray.length;
    }

    public void insert(T element) {
        if (length == array.length) {
            array = Arrays.copyOf(array, length + 1);
        }
        array[length] = element;
        length++;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = null;
        length--;
    }

    public void removeAll(T element) {
        int i = 0;
        while (i < length) {
            if (array[i].equals(element)) {
                removeByIndex(i);
            } else {
                i++;
            }
        }
    }

    public T getMin() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T min = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T getMax() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T max = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Double.parseDouble(array[i].toString());
        }
        return sum;
    }

    public double getProduct() {
        double product = 1;
        for (int i = 0; i < length; i++) {
            product *= Double.parseDouble(array[i].toString());
        }
        return product;
    }

    public int findIndex(T element) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return findIndex(element) >= 0;
    }

    public void bubbleSort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (((Comparable<T>) array[j]).compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && ((Comparable<T>) array[j]).compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public T getElement(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for array of size " + length);
        }
        return array[index];
    }

    public void setElement(int index, T element) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for array of size " + length);
        }
        array[index] = element;
    }

    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public int getLength() {
        return length;
    }

}