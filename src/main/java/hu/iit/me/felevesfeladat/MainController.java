package hu.iit.me.felevesfeladat;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="engine")
public class MainController {

    private final EngineService engineService;

    public MainController(EngineService engineService) {
        this.engineService = engineService;
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<EngineDto> allEngine() {
        return engineService.findAll();
    }

    @PostMapping(path="")
    public void newEngine(@RequestBody @Valid EngineDto engineDto) {
        engineService.save(engineDto);
    }

    @PutMapping(path="/")
    public void replaceEngine(@RequestBody @Valid EngineDto EngineDto) {
        engineService.save(EngineDto);
    }

    @DeleteMapping (path="/{id}")
    public void deleteEngine(@PathVariable("id") Long id) {
        engineService.deleteById(id);
    }

}
