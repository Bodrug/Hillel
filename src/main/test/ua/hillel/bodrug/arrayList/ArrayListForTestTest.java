package ua.hillel.bodrug.arrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListForTestTest {

    @Test
    public void shouldSetSize1WhenAddedAnd0WhenCleared(){

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        Assert.assertEquals(1,arrayList.size());

        arrayList.clear();
        Assert.assertEquals(0,arrayList.size());
    }

    @Test
    public void shouldSetSizeLessByOneWhenRemoved(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        int size = arrayList.size();
        arrayList.remove(2);
        Assert.assertEquals(2,arrayList.size());
    }
}