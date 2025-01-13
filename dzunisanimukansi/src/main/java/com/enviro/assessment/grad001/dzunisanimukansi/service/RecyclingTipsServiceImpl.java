package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTips;
import com.enviro.assessment.grad001.dzunisanimukansi.repository.RecyclingTipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class RecyclingTipsServiceImpl implements RecyclingTipsService {

    private final RecyclingTipsRepository recyclingTipsRepository;

    @Autowired
    public RecyclingTipsServiceImpl(RecyclingTipsRepository recyclingTipsRepository) {
        this.recyclingTipsRepository = recyclingTipsRepository;
    }

    @Override
    public RecyclingTips saveRecyclingTip(RecyclingTips recyclingTip) {
        return recyclingTipsRepository.save(recyclingTip);
    }

    @Override
    public List<RecyclingTips> getAllRecyclingTips() {
        return recyclingTipsRepository.findAll();
    }

    @Override
    public RecyclingTips getRecyclingTipById(Long id) {
        return recyclingTipsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Recycling tip not found with id: " + id));
    }

    @Override
    public RecyclingTips updateRecyclingTip(Long id, RecyclingTips updatedTip) {
        RecyclingTips existingTip = getRecyclingTipById(id);
        existingTip.setTip(updatedTip.getTip());
        return recyclingTipsRepository.save(existingTip);
    }

    @Override
    public void deleteRecyclingTip(Long id) {
        recyclingTipsRepository.deleteById(id);
    }
}

