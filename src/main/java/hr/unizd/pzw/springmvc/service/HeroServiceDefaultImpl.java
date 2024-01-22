package hr.unizd.pzw.springmvc.service;

import hr.unizd.pzw.springmvc.domain.Superhero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceDefaultImpl implements HeroService {

    @Override
    public List<Superhero> fetchAll() {
        return List.of(
                new Superhero(1L, "Batman", "Dark knight"),
                new Superhero(2L, "Superman", "Red boots"),
                new Superhero(3L, "Spiderman", "Net")
        );
    }
}
