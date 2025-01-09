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
public class Screen extends BaseModel{
    private String screen_name;
    private List<Feature> features;
    private List<Seat> seats;

}
