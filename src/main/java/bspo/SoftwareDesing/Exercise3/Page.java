package bspo.SoftwareDesing.Exercise3;

import java.util.LinkedList;

public class Page {
    LinkedList<ItemObjects> list = new LinkedList<>();

    public void setSize(int size) {
        this.size = size;
    }

    private int size;
    public Page(int limit){
        this.size = limit;
    }

    void add(ItemObjects item){

        list.add(item);
    }
    void print(){
        ItemObjects current = list.getFirst();
        int position =0;
        while (current != null){

            System.out.println("####################################");

            System.out.println("Id Item: "+current.getId());
            System.out.println("Name Item: "+current.getName());
            System.out.println("Price Item: "+current.getPrice());
            position++;
            current = list.get(position);

            System.out.println("####################################");
        }
    }

}
