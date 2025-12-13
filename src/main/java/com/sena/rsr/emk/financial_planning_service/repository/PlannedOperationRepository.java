package com.sena.rsr.emk.financial_planning_service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.rsr.emk.financial_planning_service.model.PlannedOperation;

public interface PlannedOperationRepository extends JpaRepository<PlannedOperation, Integer> {
    List<PlannedOperation> findByUserIdAndPlanificationId(Integer userId, Integer planificationId);

    Optional<PlannedOperation> findByIdAndUserIdAndPlanificationId(Integer id, Integer userId, Integer planificationId);

    boolean existsByIdAndUserIdAndPlanificationId(Integer id, Integer userId, Integer planificationId);
}
