package com.enviro.assessment.grad001.dzunisanimukansi.controller;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.dzunisanimukansi.service.DisposalGuidelinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelinesController {

    @Autowired
    private DisposalGuidelinesService service;

    @PostMapping
    public ResponseEntity<DisposalGuidelines> createGuidelines(@Valid @RequestBody DisposalGuidelines guidelines) {
        return new ResponseEntity<>(service.createDisposalGuidelines(guidelines), HttpStatus.CREATED);
    }

    @GetMapping
    public List<DisposalGuidelines> getAllGuidelines() {
        return service.getAllDisposalGuidelines();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> updateGuidelines(@PathVariable Long id, @Valid @RequestBody DisposalGuidelines guidelines) {
        return new ResponseEntity<>(service.updateDisposalGuidelines(id, guidelines), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuidelines(@PathVariable Long id) {
        service.deleteDisposalGuidelines(id);
        return ResponseEntity.noContent().build();
    }
}