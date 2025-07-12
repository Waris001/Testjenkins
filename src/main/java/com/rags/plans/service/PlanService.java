package com.rags.plans.service;

import java.util.List;
import java.util.Map;

import com.rags.plans.entity.Plans;

public interface PlanService {

	public boolean savePlan(Plans plm);
	public Map<Integer, String> getPlanCategory();
	public List<Plans> getPlans();
	public Plans getPlan(Integer id);
	public boolean updatePlan(Plans plm);
	public boolean deletePlan(Integer id);
	public boolean activatePlan(Integer id, String status);
}
