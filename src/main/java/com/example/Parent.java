package com.example;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ValueHolder<? extends Value> valueHolder;

    public Long getId() {
        return id;
    }

    public ValueHolder<? extends Value> getValueHolder() {
        return valueHolder;
    }

    public void setValueHolder(ValueHolder<? extends Value> valueHolder) {
        this.valueHolder = valueHolder;
    }
}
