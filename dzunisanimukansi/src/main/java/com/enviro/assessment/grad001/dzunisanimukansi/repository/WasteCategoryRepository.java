package com.enviro.assessment.grad001.dzunisanimukansi.repository;

import com.enviro.assessment.grad001.dzunisanimukansi.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {

}
