package passionproject.bookit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import passionproject.bookit.domain.Artist;
import passionproject.bookit.repository.ArtistRepository;


@Component
public class DataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);

    private ArtistRepository artistRepository;

    public DataLoader(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading data from DataLoader...");
        artistRepository.save(new Artist("Mara", "Seily", "Wren", "swren13", "happy", "swren@g.com"));
        artistRepository.save(new Artist("Rock Dove", "Dollie", "Bizley", "Doll57", "12345", "DollieBiz57@g.com"));

    }
}


