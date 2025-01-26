package com.enviro.assessment.grad001.dzunisanimukansi.controller;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuideline;
import com.enviro.assessment.grad001.dzunisanimukansi.service.DisposalGuidelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelineController {

    @Autowired
    private DisposalGuidelineService service;

    @PostMapping
    public ResponseEntity<DisposalGuideline> createGuidelines(@Valid @RequestBody DisposalGuideline guidelines) {
        return new ResponseEntity<>(service.createDisposalGuidelines(guidelines), HttpStatus.CREATED);
    }

    @GetMapping
    public List<DisposalGuideline> getAllGuidelines() {
        return service.getAllDisposalGuidelines();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuideline> updateGuidelines(@PathVariable Long id, @Valid @RequestBody DisposalGuideline guidelines) {
        return new ResponseEntity<>(service.updateDisposalGuidelines(id, guidelines), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuidelines(@PathVariable Long id) {
        service.deleteDisposalGuidelines(id);
        return ResponseEntity.noContent().build();
    }
}