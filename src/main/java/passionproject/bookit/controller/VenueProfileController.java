package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.domain.ArtistProfile;
import passionproject.bookit.domain.VenueProfile;
import passionproject.bookit.repository.VenueProfileRepository;

@RestController
public class VenueProfileController {

    private VenueProfileRepository venueProfileRepository;

    @Autowired
    public VenueProfileController(VenueProfileRepository venueProfileRepository) {
        this.venueProfileRepository = venueProfileRepository;
    }

    @PostMapping("/venue-profile")
    public ResponseEntity<ArtistProfile> createVenueProfile(@RequestBody VenueProfile profile) {
        venueProfileRepository.save(profile);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/venue-profile/{id}")
    public ResponseEntity<Artist> getVenueProfile(@PathVariable Long id) {
        venueProfileRepository.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/venue-profile/{id}")
    public ResponseEntity<?> updateVenueProfile(@RequestBody VenueProfile profile, @PathVariable Long id) {
        venueProfileRepository.save(profile);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/venue-profile/{id}")
    public ResponseEntity<?> deleteArtistProfile(@PathVariable VenueProfile profile) {
        venueProfileRepository.delete(profile);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
