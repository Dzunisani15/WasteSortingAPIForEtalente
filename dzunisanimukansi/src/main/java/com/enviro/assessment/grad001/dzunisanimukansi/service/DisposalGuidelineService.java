package com.enviro.assessment.grad001.dzunisanimukansi.service;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuideline;

import java.util.List;

public interface DisposalGuidelineService {
    DisposalGuideline createDisposalGuidelines(DisposalGuideline guidelines);
    List<DisposalGuideline> getAllDisposalGuidelines();
    DisposalGuideline updateDisposalGuidelines(Long id, DisposalGuideline guidelines);
    void deleteDisposalGuidelines(Long id);
}
