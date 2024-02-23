package bspo.SoftwareDesing.Exercise3;

import java.util.LinkedList;

public class Book implements IPagination{
    LinkedList<Page> pageList;
    int position;
    public Book(LinkedList<Page> page){
        this.position = 0;
        this.pageList = page;
    }
    @Override
    public Page first() {
        return pageList.getFirst();
    }

    @Override
    public Page last() {
        return pageList.getLast();
    }

    @Override
    public Page next() {
        position++;
        return pageList.get(position);
    }

    @Override
    public Page prev() {
        position--;
        return pageList.get(position);
    }

    @Override
    public Page goTo(int id) {
        return pageList.get(id);
    }

    @Override
    public void display(int id) {
        Page page = pageList.get(id);
        page.print();

    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
