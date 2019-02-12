package ua.hillel.bodrug.lesson18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    private Object[] objects = new Object[0];

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object.equals(o)) {
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
                if (index == objects.length) {
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

        Object[] newObjects = new Object[objects.length + 1];
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

        if (contains(o)) {
            Object[] newObjects = new Object[objects.length - 1];
            int j = 0;
            for (Object object : objects) {
                if (object != o) {
                    newObjects[j] = object;
                    j++;
                }
            }
            objects = newObjects;
            return true;
        } else return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            add(o);

        }
        return true;

    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            if (!contains(iterator.next())) {
                remove(iterator);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            if (contains(iterator.next())) {
                remove(iterator);
            }
        }
        return true;

    }

    @Override
    public boolean containsAll(Collection c) {

        boolean cont = false;
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            if (contains(iterator.next())) {
                cont = true;
            }
            else cont=false;
        }
        return cont;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] newObjects = new Object[1];
        newObjects[0] = a;
        return newObjects;
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }

    //Здесь был палец
    /*private static class Palec implements Iterator {
        private final Object[] objects;
        private int index = 0;

        public Palec(Object[] objects) {
            this.objects = objects;
        }

        @Override
        public boolean hasNext() {

            return index < objects.length;

        }

        @Override
        public Object next() {
            if (index == objects.length) {
                throw new IndexOutOfBoundsException("ooohhh");
            }
            Object result = objects[index];
            index++;
            return result;


        }
    }*/
}
