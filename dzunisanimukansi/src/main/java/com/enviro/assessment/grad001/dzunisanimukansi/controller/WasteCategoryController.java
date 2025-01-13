package com.enviro.assessment.grad001.dzunisanimukansi.controller;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.WasteCategory;
import com.enviro.assessment.grad001.dzunisanimukansi.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    private final WasteCategoryService wasteCategoryService;

    @Autowired
    public WasteCategoryController(WasteCategoryService wasteCategoryService) {
        this.wasteCategoryService = wasteCategoryService;
    }

    // Create a new waste category
    @PostMapping
    public ResponseEntity<WasteCategory> createWasteCategory(@RequestBody WasteCategory wasteCategory) {
        WasteCategory createdCategory = wasteCategoryService.saveWasteCategory(wasteCategory);
        return ResponseEntity.ok(createdCategory);
    }

    // Get all waste categories
    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllWasteCategories() {
        List<WasteCategory> categories = wasteCategoryService.getAllWasteCategories();
        return ResponseEntity.ok(categories);
    }

    // Get a specific waste category by ID
    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getWasteCategoryById(@PathVariable Long id) {
        WasteCategory category = wasteCategoryService.getWasteCategoryById(id);
        return ResponseEntity.ok(category);
    }

    // Update an existing waste category
    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateWasteCategory(
            @PathVariable Long id,
            @RequestBody WasteCategory updatedCategory
    ) {
        WasteCategory category = wasteCategoryService.updateWasteCategory(id, updatedCategory);
        return ResponseEntity.ok(category);
    }

    // Delete a waste category
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteWasteCategory(id);
        return ResponseEntity.noContent().build();
    }
}