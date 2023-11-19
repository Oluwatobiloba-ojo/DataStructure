package data_structure;

import java.util.Arrays;

public class Collection {

    private final int DEFAULTSIZE = 3;
    private int size;
    private int[] collection = new int[DEFAULTSIZE];
    private boolean isEmpty = true;
    public boolean isEmpty() {
        if (size == 0) return isEmpty;
        else return isEmpty = false;
    }

    public void add(int element) {
        int [] num;
        if (size < this.collection.length){
            collection[size] = element;
        }else {
            num = new int[size+1];
            for (int count = 0; count < num.length; count++) {
                if (count < collection.length) num[count] = collection[count];
                else num[count] = element;
            }
            this.collection = num;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public void remove(int index) {
        int length = size - 1;
        int[] nums = new int[length];
        int counter = 0;
        for (int count = 0; count < size; count++){
            if (count != index){
                nums[counter] = this.collection[count];
                counter++;
            }
        }
        size--;
        this.collection = nums;
    }
    public int get(int index) {
        if (index < size) {
            return collection[index];
        }
        else throw new IndexOutOfBoundsException("Index " + index + "Out of bound for length " + size);
    }

    public void add(int index, int element) {
        size++;
        int[] number = new int[size];
        int counter = 0;
        for (int count = 0; count < size; count++) {
            if (count != index)number[count] = this.collection[counter];
            else if (size - 1 > count){
                number[index] = element;
                number[++count] = this.collection[counter];
            }else {
                number[index] = element;
            }
            counter++;
        }
        this.collection = number;
    }

    public String toString(){
        int[] numbers = new int[size];
        for (int i = 0; i < size ; i++) {
            numbers[i] = this.collection[i];
        }
        return String.format(Arrays.toString(numbers));
    }

    public boolean contain(int element) {
        for (int number: this.collection){
            if (number == element)return true;
        }
        return false;
    }

    public void set(int index, int element) {
        this.collection[index] = element;
    }

    public int indexOf(int element) {
        for (int num = 0; num < collection.length; num++) {
            if (element == collection[num]) return num;
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int count = collection.length - 1; count >= 0; count--){
            if (element == collection[count]) return count;
        }
        return -1;
    }
}
