package com.sena.rsr.emk.financial_planning_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/financial-planning")
public class FinancialPlanningController {

    @GetMapping("/status")
    public String getStatus() {
        return "Financial Planning Service is running.";
    }

}
