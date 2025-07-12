package com.rags.plans.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rags.plans.entity.Plans;

public interface PlansRepo extends JpaRepository<Plans, Integer> {

}
