package com.brunotest;

import java.util.Iterator;

public class QueueIterator<T> implements Iterator <T> {


  //  private BrunoQueue collection;
    private QueueValue currentValue;

    public QueueIterator(BrunoQueue collection) {
   //     this.collection = collection;
        currentValue = collection.viewFirst();
    }

    @Override
    public boolean hasNext() {
        return currentValue.getNexValue() != null;

    }

    @Override
    public T next() {
        QueueValue<T> result = currentValue;
        currentValue = currentValue.getNexValue();
        return result.getValue();
    }
}
