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
public class Region extends BaseModel{
    private String name;
    private List<Theatre> theatres;
}
