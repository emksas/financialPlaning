package com.sena.rsr.emk.financial_planning_service.repository;

import com.sena.rsr.emk.financial_planning_service.model.FinancialPlanning;
import com.sena.rsr.emk.financial_planning_service.model.FinancialPlanningId;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialPlanningRepository extends JpaRepository<FinancialPlanning, FinancialPlanningId> {
     List<FinancialPlanning> findByUserId(Integer userId);
}
