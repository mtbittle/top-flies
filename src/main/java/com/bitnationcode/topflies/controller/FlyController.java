package com.bitnationcode.topflies.controller;

import com.bitnationcode.topflies.exceptions.ResourceNotFoundException;
import com.bitnationcode.topflies.model.Fly;
import com.bitnationcode.topflies.service.IFlyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlyController {

    private IFlyService flyService;

    public FlyController(IFlyService flyService) {
        this.flyService = flyService;
    }

    @GetMapping("/flies")
    public List<Fly> getAllFlies() {
        return flyService.getFlies();
    }

    @PostMapping("/flies")
    public Fly createFly(@Valid @RequestBody Fly fly) {
        return flyService.saveFly(fly);
    }

    @GetMapping("/notes/{id}")
    public Fly getFlyById(@PathVariable(value = "id") Long flyId) {
        return flyService.findById(flyId);
    }

    @PutMapping("/notes/{id}")
    public Fly updateFly(@PathVariable(value = "id") Long flyId,
                           @Valid @RequestBody Fly fly) {

        return flyService.updateFly(fly);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long flyId) {
        flyService.deleteFly(flyId);
        return ResponseEntity.ok().build();
    }
}
