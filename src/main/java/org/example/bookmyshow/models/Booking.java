package org.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel{
    private User user;
    private Date bookingDate;
    private Show show;
    private List<ShowSeat> showSeats;
    private List<Payment> payments;
    private int amount;
    private BookingStatus bookingStatus;
}
