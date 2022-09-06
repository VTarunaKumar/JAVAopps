package lecture6;

import java.util.Arrays;

public class Main {
    private static final int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;

    public Main() {
        this.data = new int[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);
        a.remove();
        a.remove();
        a.remove();
        System.out.println(a);
        System.out.println(a);


    }

    public void add(int num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    public void remove() {
        data[--size] = 0;

    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private void reSize() {
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "Main{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
