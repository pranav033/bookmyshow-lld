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
public class Theatre extends BaseModel{

    private String theatre_name;
    private List<Screen> screenList;
    private String address;
    private int ratings;
}
