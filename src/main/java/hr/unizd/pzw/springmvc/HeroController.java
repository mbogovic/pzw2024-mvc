package hr.unizd.pzw.springmvc;

import hr.unizd.pzw.springmvc.domain.Superhero;
import hr.unizd.pzw.springmvc.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hero")
public class HeroController {

    private HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/")
    public String fetchAll(Model model) {
        List<Superhero> heroList = heroService.fetchAll();
        model.addAttribute("heroList", heroList);

        return "helloWorld";
    }
}
