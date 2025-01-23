package org.example.exercism.BookingUpForBeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, dateFormatter);


    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
      return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;

    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");

        return "You have an appointment on " + formater.format(appointmentDate) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }

    public static void main(String[] args) {
        AppointmentScheduler appointmentScheduler = new AppointmentScheduler();
        System.out.println(appointmentScheduler.schedule("7/25/2019 13:45:00"));
//        appointmentScheduler.schedule("2015-05-05 10:15:30");
    }

}
