package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.domain.ArtistProfile;
import passionproject.bookit.repository.ArtistProfileRepository;


@RestController
public class ArtistProfileController {

    private ArtistProfileRepository artistProfileRepository;

    @Autowired
    public ArtistProfileController(ArtistProfileRepository artistProfileRepository) {
        this.artistProfileRepository = artistProfileRepository;
    }

    @PostMapping("/artist-profile")
    public ResponseEntity<ArtistProfile> createArtist(@RequestBody ArtistProfile profile) {
        artistProfileRepository.save(profile);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/artist-profile/{id}")
    public ResponseEntity<Artist> getArtistProfile(@PathVariable Long id) {
        artistProfileRepository.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/artist-profile/{id}")
    public ResponseEntity<?> updateArtistProfile(@RequestBody ArtistProfile profile, @PathVariable Long id) {
        artistProfileRepository.save(profile);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/artist-profile/{id}")
    public ResponseEntity<?> deleteArtistProfile(@PathVariable ArtistProfile profile) {
        artistProfileRepository.delete(profile);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
