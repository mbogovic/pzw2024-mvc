package hr.unizd.pzw.springmvc.service;

import hr.unizd.pzw.springmvc.domain.Superhero;

import java.util.List;

public interface HeroService {
    List<Superhero> fetchAll();
}
