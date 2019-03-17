package ua.hillel.bodrug.lesson19_1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void shouldBeSizeOneWhenAddedFirstElement() {
        MyList myList = new MyList();
        myList.add(1);
        Assert.assertTrue("True size", myList.size() == 1);
    }

    @Test
    public void shouldSetSize0WhenCleared(){
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.clear();
        Assert.assertTrue("True size", myList.size() == 0);
    }

    @Test
    public void shouldIncreaseSizeInEveryAdding(){
        MyList list = new MyList();
        for (int i=1; i<10 ;i++){
            list.add(i);
            Assert.assertTrue("Incorrect size in adding!",list.size()== i);
        }
    }
}