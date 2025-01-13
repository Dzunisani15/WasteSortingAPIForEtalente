package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTips;

import java.util.List;

public interface RecyclingTipsService {
    RecyclingTips saveRecyclingTip(RecyclingTips recyclingTip);

    List<RecyclingTips> getAllRecyclingTips();

    RecyclingTips getRecyclingTipById(Long id);

    RecyclingTips updateRecyclingTip(Long id, RecyclingTips updatedTip);

    void deleteRecyclingTip(Long id);
}
