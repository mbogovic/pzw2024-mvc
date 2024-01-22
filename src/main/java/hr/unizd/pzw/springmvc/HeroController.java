package hr.unizd.pzw.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hero")
public class HeroController {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("name", "Batman");
        return "helloWorld";
    }
}
