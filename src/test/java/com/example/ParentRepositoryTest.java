package com.example;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = EmbeddableGenericTestApplication.class)
@RunWith(SpringRunner.class)
public class ParentRepositoryTest {

    @Autowired
    private ParentRepository parentRepository;

    @Test
    public void should_save_parent() {
        Parent parent = new Parent();

        PercentageValue percentageValue = new PercentageValue();
        percentageValue.setPercentageValue(BigDecimal.TEN);

        parent.setValue(percentageValue);

        parentRepository.saveAndFlush(parent);

    }
}
