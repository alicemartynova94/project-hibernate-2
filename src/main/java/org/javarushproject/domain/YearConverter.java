package org.javarushproject.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.Year;

@Converter(autoApply = true)
public class YearConverter implements AttributeConverter<Year, Short> {
    @Override
    public Short convertToDatabaseColumn(Year year) {
        if (year != null) {
            return (short) year.getValue();
        }
        return null; 
    }

    @Override
    public Year convertToEntityAttribute(Short data) {
        if (data != null) {
            return Year.of(data);
        }
        return null;
    }
}
