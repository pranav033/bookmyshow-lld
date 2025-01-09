package org.example.bookmyshow.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
}
