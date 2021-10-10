package hu.iit.me.felevesfeladat;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="article")
public class MainController {

    private final EngineService engineService;

    public MainController(EngineService articleService) {
        this.engineService = articleService;
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<EngineDto> allArticles() {
        return engineService.findAll();
    }

    @PostMapping(path="")
    public void newArticle(@RequestBody @Valid EngineDto articleDto) {
        engineService.save(articleDto);
    }

    @PutMapping(path="/")
    public void replaceArticle(@RequestBody @Valid EngineDto EngineDto) {
        engineService.save(EngineDto);
    }

    @DeleteMapping (path="/{id}")
    public void deleteArticle(@PathVariable("id") Long id) {
        engineService.deleteById(id);
    }

}
