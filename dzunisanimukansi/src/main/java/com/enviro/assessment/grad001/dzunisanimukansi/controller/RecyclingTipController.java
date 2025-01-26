package com.enviro.assessment.grad001.dzunisanimukansi.controller;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTip;
import com.enviro.assessment.grad001.dzunisanimukansi.service.RecyclingTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipController {

    private final RecyclingTipService recyclingTipsService;

    @Autowired
    public RecyclingTipController(RecyclingTipService recyclingTipsService) {
        this.recyclingTipsService = recyclingTipsService;
    }

    // Create a new recycling tip
    @PostMapping
    public ResponseEntity<RecyclingTip> createRecyclingTip(@RequestBody RecyclingTip recyclingTip) {
        RecyclingTip createdTip = recyclingTipsService.saveRecyclingTip(recyclingTip);
        return ResponseEntity.ok(createdTip);
    }

    // Get all recycling tips
    @GetMapping
    public ResponseEntity<List<RecyclingTip>> getAllRecyclingTips() {
        List<RecyclingTip> tips = recyclingTipsService.getAllRecyclingTips();
        return ResponseEntity.ok(tips);
    }

    // Get a recycling tip by ID
    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTip> getRecyclingTipById(@PathVariable Long id) {
        RecyclingTip tip = recyclingTipsService.getRecyclingTipById(id);
        return ResponseEntity.ok(tip);
    }

    // Update a recycling tip
    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTip> updateRecyclingTip(
            @PathVariable Long id,
            @RequestBody RecyclingTip updatedTip
    ) {
        RecyclingTip tip = recyclingTipsService.updateRecyclingTip(id, updatedTip);
        return ResponseEntity.ok(tip);
    }

    // Delete a recycling tip
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        recyclingTipsService.deleteRecyclingTip(id);
        return ResponseEntity.noContent().build();
    }
}