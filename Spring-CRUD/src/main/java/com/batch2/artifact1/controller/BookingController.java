package com.batch2.artifact1.controller;


import com.batch2.artifact1.domain.booking;
import com.batch2.artifact1.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookingController {

    @Autowired
    private BookingRepository bookingRepo;

    @GetMapping("/book")
    public String showBookingForm() {
        return "booking-form";
    }

@PostMapping("/book")
public String handleBooking(@RequestParam String name,
                            @RequestParam String email,
                            @RequestParam String car,
                            @RequestParam String date) {

    System.out.println("Received booking: " + name + ", " + email + ", " + car + ", " + date);
    booking newBooking = new booking(name, email, car, date);
    bookingRepo.save(newBooking);
    System.out.println("Booking saved successfully");

    return "redirect:/booking-confirmation?name=" + name + "&email=" + email + "&car=" + car + "&date=" + date;
}


    @GetMapping("/booking-confirmation")
    public String showConfirmation(@RequestParam String name,
                                   @RequestParam String email,
                                   @RequestParam String car,
                                   @RequestParam String date,
                                   Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("car", car);
        model.addAttribute("date", date);
        return "booking-confirmation";
    }
}



