package com.example;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;

public class Customizers {

    public static class ValueCustomizer implements DescriptorCustomizer {
        @Override
        public void customize(ClassDescriptor descriptor) throws Exception {
            descriptor.getInheritancePolicy().setClassIndicatorFieldName("DISCRIMINATOR");
            descriptor.getInheritancePolicy().addClassIndicator(PercentageValue.class, "P");
            descriptor.getInheritancePolicy().addClassIndicator(AbsoluteValue.class, "A");
        }
    }

    public static class PercentageValueCustomizer implements DescriptorCustomizer {
        @Override
        public void customize(ClassDescriptor descriptor) throws Exception {
            descriptor.getInheritancePolicy().setParentClass(Value.class);
        }
    }

    public static class AbsoluteValueCustomizer implements DescriptorCustomizer {
        @Override
        public void customize(ClassDescriptor descriptor) throws Exception {
            descriptor.getInheritancePolicy().setParentClass(Value.class);
        }
    }
}
