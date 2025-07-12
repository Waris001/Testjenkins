package com.rags.plans.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rags.plans.entity.PlansCategory;

public interface PlanCategoryRepo extends JpaRepository<PlansCategory, Integer> {

}
