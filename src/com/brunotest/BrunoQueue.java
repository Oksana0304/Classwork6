package com.brunotest;

import java.util.Iterator;

public class BrunoQueue <T>  implements Iterable<T>{

    private QueueValue <T> nextValue ;
    private QueueValue <T> lastValue;


    public void  add (T value) {
        if (lastValue == null) {
            QueueValue<T> newValue = new QueueValue(value);
            newValue = newValue;
            lastValue = newValue;
        }
        else {
            QueueValue<T> newValue = new QueueValue<>(value, lastValue);
            lastValue.setNexValue(newValue);
            lastValue = newValue;
        }
    }
    public T get() {
        if (nextValue == null) {
            return null;
        }
        QueueValue <T> result = nextValue;

        if (nextValue == lastValue) {
            nextValue = null;
            lastValue = null;
        }
        else {
            nextValue = nextValue.getNexValue();
        }
        return  result.getValue();
    }


    public boolean hasnext () {
        return  nextValue !=null ;
    }

    public QueueValue viewFirst () {
        return nextValue;

    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<T>(this);
    }
}