package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuideline;
import com.enviro.assessment.grad001.dzunisanimukansi.repository.DisposalGuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelineServiceImpl implements DisposalGuidelineService {

    @Autowired
    private DisposalGuidelineRepository repository;

    @Override
    public DisposalGuideline createDisposalGuidelines(DisposalGuideline guidelines) {
        return repository.save(guidelines);
    }

    @Override
    public List<DisposalGuideline> getAllDisposalGuidelines() {
        return repository.findAll();
    }

    @Override
    public DisposalGuideline updateDisposalGuidelines(Long id, DisposalGuideline guidelines) {
        DisposalGuideline existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Guidelines not found"));
        existing.setMaterialType(guidelines.getMaterialType());
        existing.setGuidelines(guidelines.getGuidelines());
        return repository.save(existing);
    }

    @Override
    public void deleteDisposalGuidelines(Long id) {
        repository.deleteById(id);
    }
}