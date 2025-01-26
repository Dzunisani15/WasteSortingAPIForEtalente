package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTip;

import java.util.List;

public interface RecyclingTipService {
    RecyclingTip saveRecyclingTip(RecyclingTip recyclingTip);

    List<RecyclingTip> getAllRecyclingTips();

    RecyclingTip getRecyclingTipById(Long id);

    RecyclingTip updateRecyclingTip(Long id, RecyclingTip updatedTip);

    void deleteRecyclingTip(Long id);
}
