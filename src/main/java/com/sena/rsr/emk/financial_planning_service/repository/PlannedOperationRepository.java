package com.sena.rsr.emk.financial_planning_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.rsr.emk.financial_planning_service.model.PlannedOperation;

public interface PlannedOperationRepository extends JpaRepository<PlannedOperation, Integer> {
    List<PlannedOperation> findByUserId(Integer userId);

    List<PlannedOperation> findByPlanificationId(Integer planificationId);
}
