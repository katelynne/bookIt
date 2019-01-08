package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.repository.ArtistRepository;

@RestController
public class ArtistController {

    private ArtistRepository artistRepository;

    @Autowired
    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @PostMapping("/artist")
    public ResponseEntity<Artist> createArtist(@RequestBody Artist user) {
        artistRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/artist/{id}")
    public ResponseEntity<Artist> getArtist(@PathVariable Long id) {
        artistRepository.findOneById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/artist")
    public ResponseEntity<Iterable<Artist>> getArtistList(){
        artistRepository.findAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/artist/{id}")
    public ResponseEntity<?> updateArtist(@RequestBody Artist user, @PathVariable Long id) {
        artistRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping ("/people/{id}")
    public ResponseEntity<?> deleteArtist(@PathVariable Artist user) {
        artistRepository.delete(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
