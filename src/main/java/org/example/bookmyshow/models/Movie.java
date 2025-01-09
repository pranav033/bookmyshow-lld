package org.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends BaseModel{
    private String movieTitle;
    private Genre genre;
    private int ratings;
    private List<Language> languages;
    private List<Feature> features;
}
