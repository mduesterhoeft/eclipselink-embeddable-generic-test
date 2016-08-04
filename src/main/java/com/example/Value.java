package com.example;

import static com.fasterxml.jackson.annotation.JsonSubTypes.*;

import javax.persistence.Embeddable;

import org.eclipse.persistence.annotations.Customizer;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Embeddable
@Customizer(Customizers.ValueCustomizer.class)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
        @Type(name="PERCENTAGE", value=PercentageValue.class),
        @Type(name="ABSOLUTE", value=AbsoluteValue.class)})
public abstract class Value {
}
