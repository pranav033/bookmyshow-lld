package org.example.bookmyshow.controllers;

import org.example.bookmyshow.dtos.BookingRequestDto;
import org.example.bookmyshow.dtos.BookingResponseDto;
import org.example.bookmyshow.dtos.ResponseStatus;
import org.example.bookmyshow.models.Booking;
import org.example.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {


    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingResponseDto bookTicket(BookingRequestDto bookingRequestDto)
    {
        BookingResponseDto bookingResponseDto = new BookingResponseDto();
        try {
            Booking booking = bookingService.Bookticket(bookingRequestDto.getUserId(), bookingRequestDto.getShowId(), bookingRequestDto.getShowSeatIds());
            bookingResponseDto.setAmount(booking.getAmount());
            bookingResponseDto.setStatus(ResponseStatus.SUCCESS);
            bookingResponseDto.setBookngId(booking.getId());
        }
        catch (Exception e) {
            bookingResponseDto.setStatus(ResponseStatus.FAILURE);
        }
        return bookingResponseDto;
    }
}
