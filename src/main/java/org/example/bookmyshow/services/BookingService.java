package org.example.bookmyshow.services;

import org.example.bookmyshow.exceptions.ResourceNotFoundException;
import org.example.bookmyshow.models.*;
import org.example.bookmyshow.repositories.BookingRepository;
import org.example.bookmyshow.repositories.ShowRepository;
import org.example.bookmyshow.repositories.ShowSeatRepository;
import org.example.bookmyshow.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private BookingRepository bookingRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;

    public BookingService(BookingRepository bookingRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository, UserRepository userRepository) {
        this.bookingRepository = bookingRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    public Booking Bookticket(int userId, int showId, List<Integer> showSeatIds)
    {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) throw new ResourceNotFoundException();
        Optional<Show> optionalShow = showRepository.findById(showId);
        if(optionalShow.isEmpty()) throw new ResourceNotFoundException();
        Show show = optionalShow.get();
        User user = optionalUser.get();
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat showSeat : showSeats)
        {
            if(showSeat.getSeatStatus()!=SeatStatus.EMPTY)
            {
                throw new RuntimeException("Seats not found");
            }
        }
        for(ShowSeat showSeat : showSeats)
        {
            showSeat.setSeatStatus(SeatStatus.BOOKED);
            showSeat.setBlockedAt(new Date());
        }
        showSeatRepository.saveAll(showSeats);

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setShow(show);
        booking.setShowSeats(showSeats);
        booking.setBookingDate(new Date());
        booking.setBookingStatus(BookingStatus.SUCCESS);
        booking.setAmount(2000);
        return bookingRepository.save(booking);


    }


}
