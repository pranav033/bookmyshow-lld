package org.example.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seat extends BaseModel{
    private String seat_name;
    private int row;
    private int col;
    @ManyToOne
    private SeatType seat_type;
}
