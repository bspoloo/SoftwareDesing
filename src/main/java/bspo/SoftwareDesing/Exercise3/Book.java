package bspo.SoftwareDesing.Exercise3;

import java.util.LinkedList;
import java.util.List;

public class Book implements IPagination{
    List<Page> pageList;
    int position;
    public Book(List<Page> page){
        this.position = 0;
        this.pageList = page;
    }
    @Override
    public Page first() {
        position = 0;
        return pageList.getFirst();
    }

    @Override
    public Page last() {
        position = pageList.size();
        return pageList.getLast();
    }

    @Override
    public Page next() {

        if (isLast()){
            return null;
        }
        position++;
        return pageList.get(position);
    }

    @Override
    public Page prev() {

        if (isFirst()){
            return null;
        }
        position--;
        return pageList.get(position);
    }

    @Override
    public Page goTo(int id) {
        if (id <= 0 || id > pageList.size()){
            return null;
        }
        position = id;
        return pageList.get(position);
    }
    @Override
    public void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }
    private boolean isLast(){
        return position == pageList.size();
    }
    private boolean isFirst(){
        return position == 0;
    }
}
