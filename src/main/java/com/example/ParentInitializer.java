package com.example;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ParentInitializer implements ApplicationRunner {

    private final ParentRepository parentRepository;

    public ParentInitializer(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        addPercentageParent();
        addAbsoluteParent();
    }

    private void addPercentageParent() {
        Parent parent = new Parent();
        ValueHolder<PercentageValue> percentageValueValueHolder = new ValueHolder<>();
        percentageValueValueHolder.setType("PERCENTAGE");

        PercentageValue percentageValue = new PercentageValue();
        percentageValue.setPercentageValue(BigDecimal.TEN);
        percentageValueValueHolder.setValue(percentageValue);

        percentageValueValueHolder.setValue(percentageValue);

        parent.setValueHolder(percentageValueValueHolder);

        parentRepository.saveAndFlush(parent);
    }

    private void addAbsoluteParent() {
        Parent parent = new Parent();
        ValueHolder<AbsoluteValue> absoluteValueHolder = new ValueHolder<>();
        absoluteValueHolder.setType("ABSOLUTE");

        AbsoluteValue absoluteValue = new AbsoluteValue();
        absoluteValue.setAbsoluteValue(99L);
        absoluteValueHolder.setValue(absoluteValue);

        absoluteValueHolder.setValue(absoluteValue);

        parent.setValueHolder(absoluteValueHolder);

        parentRepository.saveAndFlush(parent);
    }
}
