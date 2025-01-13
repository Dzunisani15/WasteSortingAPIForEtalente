package com.enviro.assessment.grad001.dzunisanimukansi.repository;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.DisposalGuidelines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisposalGuidelinesRepository extends JpaRepository<DisposalGuidelines, Long> {
}