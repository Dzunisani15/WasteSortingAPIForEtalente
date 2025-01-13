package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.WasteCategory;

import java.util.List;

public interface WasteCategoryService {
    WasteCategory saveWasteCategory(WasteCategory wasteCategory);

    List<WasteCategory> getAllWasteCategories();

    WasteCategory getWasteCategoryById(Long id);

    WasteCategory updateWasteCategory(Long id, WasteCategory updatedCategory);

    void deleteWasteCategory(Long id);
}