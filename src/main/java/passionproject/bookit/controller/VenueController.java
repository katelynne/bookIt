package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Venue;
import passionproject.bookit.repository.VenueRepository;

@RestController
public class VenueController {

    private VenueRepository venueRepository;

    @Autowired
    public VenueController(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }


    @PostMapping("/venue")
    public ResponseEntity<Venue> createUserVenue(@RequestBody Venue user) {
        venueRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/Venue/{id}")
    public ResponseEntity<Venue> getUserVenue(@PathVariable Long id) {
        venueRepository.findOneById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/venue")
    public ResponseEntity<Iterable<Venue>> getUserVenueList(){
        venueRepository.findAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/venue/{id}")
    public ResponseEntity<?> updateUserVenue(@RequestBody Venue user, @PathVariable Long id) {
        venueRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/venue/{id}")
    public ResponseEntity<?> deleteUserVenue(@PathVariable Venue user) {
        venueRepository.delete(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
