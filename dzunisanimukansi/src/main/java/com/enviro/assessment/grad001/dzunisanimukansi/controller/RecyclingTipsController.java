package com.enviro.assessment.grad001.dzunisanimukansi.controller;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTips;
import com.enviro.assessment.grad001.dzunisanimukansi.service.RecyclingTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipsController {

    private final RecyclingTipsService recyclingTipsService;

    @Autowired
    public RecyclingTipsController(RecyclingTipsService recyclingTipsService) {
        this.recyclingTipsService = recyclingTipsService;
    }

    // Create a new recycling tip
    @PostMapping
    public ResponseEntity<RecyclingTips> createRecyclingTip(@RequestBody RecyclingTips recyclingTip) {
        RecyclingTips createdTip = recyclingTipsService.saveRecyclingTip(recyclingTip);
        return ResponseEntity.ok(createdTip);
    }

    // Get all recycling tips
    @GetMapping
    public ResponseEntity<List<RecyclingTips>> getAllRecyclingTips() {
        List<RecyclingTips> tips = recyclingTipsService.getAllRecyclingTips();
        return ResponseEntity.ok(tips);
    }

    // Get a recycling tip by ID
    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTips> getRecyclingTipById(@PathVariable Long id) {
        RecyclingTips tip = recyclingTipsService.getRecyclingTipById(id);
        return ResponseEntity.ok(tip);
    }

    // Update a recycling tip
    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTips> updateRecyclingTip(
            @PathVariable Long id,
            @RequestBody RecyclingTips updatedTip
    ) {
        RecyclingTips tip = recyclingTipsService.updateRecyclingTip(id, updatedTip);
        return ResponseEntity.ok(tip);
    }

    // Delete a recycling tip
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        recyclingTipsService.deleteRecyclingTip(id);
        return ResponseEntity.noContent().build();
    }
}