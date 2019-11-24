package com.brunotest;

public class QueueValue <T> {

    private T value;
    private QueueValue prevValue;
    private QueueValue nexValue;

    public QueueValue(T value) {
        this.value = value;
    }


    public QueueValue(T value, QueueValue prevValue) {
        this(value);
        this.prevValue = prevValue;
    }


    public T getValue() {
        return value;
    }

    public QueueValue getPrevValue() {
        return prevValue;
    }

    public QueueValue getNexValue() {
        return nexValue;
    }

    public void setNexValue(QueueValue nexValue) {
        this.nexValue = nexValue;
    }
}
