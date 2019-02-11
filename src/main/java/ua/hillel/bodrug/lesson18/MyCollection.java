package ua.hillel.bodrug.lesson18;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {
    private Object[] objects = new Object[0];

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {

                return index < objects.length;

            }

            @Override
            public Object next() {
                if (index==objects.length){
                    throw new IndexOutOfBoundsException("ooohhh");
                }
                Object result = objects[index];
                index++;
                return result;


            }
        };

    }

    @Override
    public Object[] toArray() {
        Object[] newObjects = new Object[size()];
        for (Object object : objects) {
            add(object);
        }
        return newObjects;
    }

    @Override
    public boolean add(Object o) {

        Object[] newObjects = new Object[objects.length+1];
        for (int i = 0; i < objects.length; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[objects.length] = o;
        objects = newObjects;
        //setObjects(newObjects);
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
        for (Object o : c){
            add(o);

        }
        return true;
        //return false;
    }

    @Override
    public void clear() {
        objects = new Object[0];
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
        return a;
    }

    public  void print(){
        for (Object object : objects) {
            System.out.println(object);;
        }
    }

    private static class Palec implements Iterator {
        private final Object[] objects;
        private int index = 0;
        public Palec(Object[] objects){
            this.objects = objects;
        }
        @Override
        public boolean hasNext() {

            return index < objects.length;

        }

        @Override
        public Object next() {
            if (index==objects.length){
                throw new IndexOutOfBoundsException("ooohhh");
            }
            Object result = objects[index];
            index++;
            return result;


        }
    }
}
