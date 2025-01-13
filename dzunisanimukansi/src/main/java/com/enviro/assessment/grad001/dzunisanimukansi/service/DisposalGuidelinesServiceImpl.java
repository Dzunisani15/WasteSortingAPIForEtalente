package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuidelines;
import com.enviro.assessment.grad001.dzunisanimukansi.repository.DisposalGuidelinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelinesServiceImpl implements DisposalGuidelinesService {

    @Autowired
    private DisposalGuidelinesRepository repository;

    @Override
    public DisposalGuidelines createDisposalGuidelines(DisposalGuidelines guidelines) {
        return repository.save(guidelines);
    }

    @Override
    public List<DisposalGuidelines> getAllDisposalGuidelines() {
        return repository.findAll();
    }

    @Override
    public DisposalGuidelines updateDisposalGuidelines(Long id, DisposalGuidelines guidelines) {
        DisposalGuidelines existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Guidelines not found"));
        existing.setMaterialType(guidelines.getMaterialType());
        existing.setGuidelines(guidelines.getGuidelines());
        return repository.save(existing);
    }

    @Override
    public void deleteDisposalGuidelines(Long id) {
        repository.deleteById(id);
    }
}