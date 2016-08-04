package com.example;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class ValueHolder<T extends Value> {

    @Embedded
    private Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
