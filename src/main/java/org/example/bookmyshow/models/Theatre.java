package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Theatre extends BaseModel{

    private String theatre_name;
    @OneToMany
    private List<Screen> screenList;
    private String address;
    @ManyToOne
    private Region region;
    private int ratings;
}
