package org.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Show extends BaseModel{

    private int id;
    private Date dateTime;
    private Theatre theatre;
    private Screen screen;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
