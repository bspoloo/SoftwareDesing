package bspo.SoftwareDesing.Exercise3Corrected;

import java.util.ArrayList;
import java.util.List;

public class Paginator implements IPaginator {
    public List<Page> pageList;
    int position;
    public Paginator() {
        this.position = 0;
        this.pageList = new ArrayList<>(){};
    }

    @Override
    public void add(Page element) {
        pageList.add(element);
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
            position = pageList.size();
            return null;
        }
        position++;
        return pageList.get(position);
    }

    @Override
    public Page prev() {
        if (isFirst()){
            position = -1;
            return null;
        }
        position--;
        return pageList.get(position);
    }

    @Override
    public Page goTo(int id) {
        id--;
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
        return position >= pageList.size()-1;
    }
    private boolean isFirst(){
        return position <= 0;
    }
}
