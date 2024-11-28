package OOPs.Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also works as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (this.isFull()){
             resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items into the new array : System.arraycopy(data, 0, temp, 0, data.length);
        for(int i = 0; i<data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return Arrays.toString(data) + " size: " + size;
    }


    public static void main(String[] args) {
        // ArrayList list = new ArrayList();

        CustomArrayList list = new CustomArrayList();

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        // Here the size is the number of elements in the arraylist we made

        // System.out.println(list);

        for (int i = 0; i < 14 ; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

    }
}
