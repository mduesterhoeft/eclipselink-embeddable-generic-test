package com.example;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import org.eclipse.persistence.annotations.Customizer;

@Embeddable
@Customizer(Customizers.PercentageValueCustomizer.class)
public class PercentageValue extends Value {

    private BigDecimal percentageValue;

    public BigDecimal getPercentageValue() {
        return percentageValue;
    }

    public void setPercentageValue(BigDecimal percentageValue) {
        this.percentageValue = percentageValue;
    }
}
