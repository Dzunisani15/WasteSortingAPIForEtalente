package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuidelines;

import java.util.List;

public interface DisposalGuidelinesService {
    DisposalGuidelines createDisposalGuidelines(DisposalGuidelines guidelines);
    List<DisposalGuidelines> getAllDisposalGuidelines();
    DisposalGuidelines updateDisposalGuidelines(Long id, DisposalGuidelines guidelines);
    void deleteDisposalGuidelines(Long id);
}
