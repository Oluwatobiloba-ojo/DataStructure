package data_structure;

public class Set {

   private Collection collection = new Collection();
    private int size;
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void add(int element) {
        if (!this.collection.contain(element)) {
            this.collection.add(element);
            size++;
        }
    }

    public int size() {
        return this.collection.size();
    }

    public void remove(int element) {
        this.collection.remove(collection.indexOf(element));
    }

    public void clear() {
        this.collection = new Collection();
        size = 0;
    }

    public boolean contain(int element) {
        return this.collection.contain(element);
    }

    public String toString(){
        return collection.toString();
    }
}
