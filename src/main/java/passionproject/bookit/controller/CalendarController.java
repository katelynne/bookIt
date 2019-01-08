package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.domain.ArtistProfile;
import passionproject.bookit.domain.Calendar;
import passionproject.bookit.repository.CalendarRepository;

public class CalendarController {

    private CalendarRepository calendarRepository;

    @Autowired
    public CalendarController(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    @PostMapping("/calendar")
    public ResponseEntity<ArtistProfile> createCalendar(@RequestBody Calendar calendar) {
        calendarRepository.save(calendar);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/calendar/{id}")
    public ResponseEntity<Artist> getCalendar(@PathVariable Long id) {
        calendarRepository.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/artist-profile/{id}")
    public ResponseEntity<?> updateCalendar(@RequestBody Calendar calendar, @PathVariable Long id) {
        calendarRepository.save(calendar);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/calendar/{id}")
    public ResponseEntity<?> deleteCalendar(@PathVariable Calendar calendar) {
        calendarRepository.delete(calendar);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
