package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.MarinaService;

@RestController
@AllArgsConstructor
public class MarinaController {
    private MarinaService marinaService;

    @PostMapping("/marina")
    public String marina(@RequestBody String formul) {
        return marinaService.marina(formul);
    }
}
