package com.example;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import org.eclipse.persistence.annotations.Customizer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Embeddable
@Customizer(Customizers.PercentageValueCustomizer.class)
@JsonSerialize(as = PercentageValue.class)
public class PercentageValue extends Value {

    private BigDecimal percentageValue;

    public BigDecimal getPercentageValue() {
        return percentageValue;
    }

    public void setPercentageValue(BigDecimal percentageValue) {
        this.percentageValue = percentageValue;
    }
}
