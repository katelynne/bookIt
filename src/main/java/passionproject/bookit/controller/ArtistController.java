package passionproject.bookit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.repository.ArtistRepository;

import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {

    private ArtistRepository artistRepository;

    @Autowired
    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }
//
//    @PostMapping("/artist")
//    public ResponseEntity<Artist> createArtist(@RequestBody Artist user) {
//        artistRepository.save(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void createArtist(@RequestBody Artist artist){
        artistRepository.save(artist);
    }

//    @GetMapping("artist/{id}")
//    public ResponseEntity<Artist> getArtist(@PathVariable Long id) {
//        artistRepository.findById(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artistRepository.getOne(id);
    }

//    @GetMapping("/artist")
//    public ResponseEntity<Iterable<Artist>> getArtistList(){
//        artistRepository.findAll();
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    @GetMapping()
    public List<Artist> list(){
       return artistRepository.findAll();
    }

//    @PutMapping("/artist/{id}")
//    public ResponseEntity<?> updateArtist(@RequestBody Artist user, @PathVariable Long id) {
//        artistRepository.save(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @DeleteMapping ("/artist/{id}")
//    public ResponseEntity<?> deleteArtist(@PathVariable Artist user) {
//        artistRepository.delete(user);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
}
