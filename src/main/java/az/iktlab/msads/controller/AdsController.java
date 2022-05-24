package az.iktlab.msads.controller;

import az.iktlab.msads.model.AdsDto;
import az.iktlab.msads.service.AdsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
public class AdsController {

    private final AdsService service;

    public AdsController(AdsService service) {
        this.service = service;
    }

    @PostMapping
    public void add(@RequestBody AdsDto adsDto) {
        service.add(adsDto);
    }

    @GetMapping
    public List<AdsDto> getAll() {
        return service.getAll();
    }
}
