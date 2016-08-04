package com.example;

import javax.persistence.Embeddable;

import org.eclipse.persistence.annotations.Customizer;

@Embeddable
@Customizer(Customizers.ValueCustomizer.class)
public class Value {
}
