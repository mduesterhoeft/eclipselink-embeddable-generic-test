This repository shows an example of an entity that contains an embeddable with a generic type.

A `Parent` contains a value that ether is a `PercentageValue` or an `AbsoluteValue`.

Inheritance of embeddables in eclipselink is possible using customizers:
http://wiki.eclipse.org/EclipseLink/UserGuide/JPA/Basic_JPA_Development/Entities/Embeddable#Example:_Using_a_DescriptorCustomizer_to_enable_inheritance_in_an_embeddable

Serialization of objects with JsonTypeInfo seems to be broken in spring-data-rest
