package org.example.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie extends BaseModel{
    private String movieTitle;
    private Genre genre;
    private int ratings;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Language> languages;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;
}
