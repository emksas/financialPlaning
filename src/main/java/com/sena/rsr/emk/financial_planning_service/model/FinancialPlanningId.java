package com.sena.rsr.emk.financial_planning_service.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FinancialPlanningId {
    private Integer planId; // idplanificacionfinanciera
    private Integer userId; // usuario_cedula
}
