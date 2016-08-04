package com.example;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class ValueHolder<T extends Value> {

    private String type;

    @Embedded
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
