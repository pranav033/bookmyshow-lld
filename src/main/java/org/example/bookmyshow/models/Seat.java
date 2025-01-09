package org.example.bookmyshow.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seat extends BaseModel{
    private String seat_name;
    private int row;
    private int col;
}
