package com.example;

import javax.persistence.Embeddable;

import org.eclipse.persistence.annotations.Customizer;

@Embeddable
@Customizer(Customizers.AbsoluteValueCustomizer.class)
public class AbsoluteValue extends Value {

    private Long absoluteValue;

    public Long getAbsoluteValue() {
        return absoluteValue;
    }

    public void setAbsoluteValue(Long absoluteValue) {
        this.absoluteValue = absoluteValue;
    }
}
