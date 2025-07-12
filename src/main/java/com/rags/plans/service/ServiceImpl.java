package com.rags.plans.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rags.plans.entity.Plans;
import com.rags.plans.entity.PlansCategory;
import com.rags.plans.repo.PlanCategoryRepo;
import com.rags.plans.repo.PlansRepo;

@Service
public class ServiceImpl implements PlanService {

	@Autowired
	PlanCategoryRepo PlanCategoryRepo;
	@Autowired
	PlansRepo PlanRepo;
	
	@Override
	public boolean savePlan(Plans plm) {
	 Plans a = PlanRepo.save(plm);
	 return a.getPlanId()!=null ;
	}
	
	@Override
	public Map<Integer, String> getPlanCategory() {
		List<PlansCategory> cat_list = PlanCategoryRepo.findAll();
		Map<Integer, String> cat_map = new LinkedHashMap<>();
		cat_list.forEach(a->{
			cat_map.put(a.getCategoryId(), a.getCategoryName());
		});
		
		return cat_map;
	}
	@Override
	public List<Plans> getPlans() {
		
		return PlanRepo.findAll();
	}
	@Override
	public Plans getPlan(Integer id) {
		 Optional<Plans> byId = PlanRepo.findById(id);
		 if(byId.isPresent())
			return byId.get();
		return null;
	}
	@Override
	public boolean updatePlan(Plans plm) {
		PlanRepo.save(plm);
		return plm.getPlanId()!=null;
	}
	@Override
	public boolean deletePlan(Integer id) {
		try {
			PlanRepo.deleteById(id);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	@Override
	public boolean activatePlan(Integer id, String status) {
	Optional<Plans> byId = PlanRepo.findById(id);
	if(byId.isPresent()) {
		Plans plan = byId.get();
		plan.setStatus(status);
		PlanRepo.save(plan);
		return true;
	}
		return false;
	}
	

}
