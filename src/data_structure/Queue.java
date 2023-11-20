package data_structure;

import java.util.NoSuchElementException;

public class Queue {

    private final Collection collection = new Collection();
    private int size;
    public Queue(){
    }
    public Queue(int size) {
        this.size = size;
    }

    public int size() {
        return collection.size();
    }

    public boolean isEmpty(){
        return this.collection.isEmpty();
    }

    public void add(int element) {
        if (collection.size() != size || size == 0){
            collection.add(element);
        }else {
            throw new IllegalStateException("Queue already full");
        }
    }

    public boolean offer(int element) {
        if (collection.size() != size || size == 0){
            collection.add(element);
            return true;
        }else {
            return false;
        }
    }

    public int remove() {
        if (collection.isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        int nums = this.collection.get(0);
        this.collection.remove(0);
        return nums;
    }

    public Integer poll() {
        if (this.collection.isEmpty()){
            return null;
        }
        int num = this.collection.get(0);
        this.collection.remove(0);
        return num;
    }

    public Integer peek() {
        if (this.collection.isEmpty())return null;
        return this.collection.get(0);
    }

    public Integer element() {
        if (this.collection.isEmpty()) throw new NoSuchElementException("No such element");
        return this.collection.get(0);
    }

    public String toString(){
        return this.collection.toString();
    }
}
