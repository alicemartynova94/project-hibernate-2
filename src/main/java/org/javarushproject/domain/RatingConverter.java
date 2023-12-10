package org.javarushproject.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {
    @Override
    public String convertToDatabaseColumn(Rating rating) {
        return rating.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String data) {
        Rating[] ratingValues = Rating.values();
        for (Rating ratingValue : ratingValues) {
            if(ratingValue.getValue().equals(data)){
                return ratingValue;
            }
        }
        return null;
    }
}
