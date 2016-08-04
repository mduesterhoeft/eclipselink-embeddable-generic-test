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

        PercentageValue percentageValue = new PercentageValue();
        percentageValue.setPercentageValue(BigDecimal.valueOf(0.95));

        parent.setValue(percentageValue);

        parentRepository.saveAndFlush(parent);
    }

    private void addAbsoluteParent() {
        Parent parent = new Parent();

        AbsoluteValue absoluteValue = new AbsoluteValue();
        absoluteValue.setAbsoluteValue(99L);

        parent.setValue(absoluteValue);

        parentRepository.saveAndFlush(parent);
    }
}
