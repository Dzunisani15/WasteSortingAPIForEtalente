package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.RecyclingTip;
import com.enviro.assessment.grad001.dzunisanimukansi.repository.RecyclingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class RecyclingTipServiceImpl implements RecyclingTipService {

    private final RecyclingTipRepository recyclingTipsRepository;

    @Autowired
    public RecyclingTipServiceImpl(RecyclingTipRepository recyclingTipsRepository) {
        this.recyclingTipsRepository = recyclingTipsRepository;
    }

    @Override
    public RecyclingTip saveRecyclingTip(RecyclingTip recyclingTip) {
        return recyclingTipsRepository.save(recyclingTip);
    }

    @Override
    public List<RecyclingTip> getAllRecyclingTips() {
        return recyclingTipsRepository.findAll();
    }

    @Override
    public RecyclingTip getRecyclingTipById(Long id) {
        return recyclingTipsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Recycling tip not found with id: " + id));
    }

    @Override
    public RecyclingTip updateRecyclingTip(Long id, RecyclingTip updatedTip) {
        RecyclingTip existingTip = getRecyclingTipById(id);
        existingTip.setTip(updatedTip.getTip());
        return recyclingTipsRepository.save(existingTip);
    }

    @Override
    public void deleteRecyclingTip(Long id) {
        recyclingTipsRepository.deleteById(id);
    }
}

