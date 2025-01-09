package org.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShowSeatType {

    private Show show;
    private ShowSeatType showSeatType;
    private int price;
}
