package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.domain.ArtistProfile;
import passionproject.bookit.domain.Calendar;
import passionproject.bookit.domain.Location;
import passionproject.bookit.repository.LocationRepository;

public class LocationController {

    private LocationRepository locationRepository;


    @Autowired
    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @PostMapping("/location")
    public ResponseEntity<Location> createLocation(@RequestBody Location location) {
        locationRepository.save(location);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Location> getLocation(@PathVariable Long id) {
        locationRepository.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/location/{id}")
    public ResponseEntity<?> updateLocation(@RequestBody Location location, @PathVariable Long id) {
        locationRepository.save(location);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/location/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable Location location) {
        locationRepository.delete(location);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }



}
