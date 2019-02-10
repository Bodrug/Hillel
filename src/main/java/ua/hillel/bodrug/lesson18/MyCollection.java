package ua.hillel.bodrug.lesson18;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {
    private Object[] objects;

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (Object object : objects) {
            if (object != null){
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public boolean add(Object o) {
        if(objects==null| o==null){
            return false;
        }

        Object[] newObjects = new Object[objects.length+1];
        for (int i = 0; i < objects.length; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[objects.length] = o;
        setObjects(newObjects);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(objects==null| o==null | objects.length<=1){
            return false;
        }
        if (this.contains(o)) {
            Object[] newObjects = new Object[objects.length - 1];
            int j = 0;
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] != o) {
                    newObjects[j] = objects[i];
                    j++;
                }
            }
            setObjects(newObjects);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for (Object object : objects) {
            object = null;
        }
        setObjects(objects);
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return objects;
    }

    public  void print(){
        for (Object object : objects) {
            System.out.println(object);;
        }
    }
}
