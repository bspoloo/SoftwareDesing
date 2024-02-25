package bspo.SoftwareDesing.Exercise3;

import java.util.Iterator;
import java.util.LinkedList;

public class Page {
    LinkedList<ItemObjects> listItem = new LinkedList<>();

    private int size;
    private int count;

    public Page(int size) {
        this.size = size;
    }

    void add(ItemObjects item) {
        if (count == size) {
            System.out.println("List is full");
        }else{
            count++;
            listItem.add(item);
        }

    }

    void print() {

        Iterator<ItemObjects> iterator = listItem.iterator();

        while (iterator.hasNext()) {
            ItemObjects current = iterator.next();

            System.out.println("Id Item: " + current.getId()+" ,"+"Name Item: " + current.getName()+" ,"+"Price Item: " + current.getPrice());

        }
    }

    public void setSize(int size) {
        this.size = size;
    }
}
