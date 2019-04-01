import java.util.LinkedList;

public class HashMap{
    private int bucketSize = 16;
    private LinkedList<KeyValue>[] elements;

    HashMap(){
        this.elements = new LinkedList[bucketSize];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new LinkedList<>();
        }
    }


    public void add(String key, Integer value){
        int position = getHash(key);
        LinkedList list = elements[position];
        KeyValue keyValue = new KeyValue(key, value);
        list.add(keyValue);
        System.out.println(list);


    }

    public int getHash(String key){
        return key.hashCode() % bucketSize;
    }
}
