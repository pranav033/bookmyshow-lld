package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private double amount;
    private Date paymentDate;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
    private String refNumber;
    @Enumerated(EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @ManyToOne
    private Booking booking;

}
