package com.rags.plans.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "plans")
public class Plans 
{
	@Id
	@GeneratedValue
	@Column
	private Integer planId;
	
	private LocalDate startDate;
	
	private LocalDate endtDate;
	
	private LocalDate date;
	
	@Column(name = "active_status")
	private String status;
	
	@Column(name = "category_id")
	private Integer categoryID;
	
	@Column(name = "creation_date", updatable = false)
	@CreationTimestamp
	private LocalDate creationDate;
	
	@Column(name = "update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updationDdate;

//	public Integer getPlanId() {
//		return planId;
//	}
//
//	public void setPlanId(Integer planId) {
//		this.planId = planId;
//	}
//
//	public LocalDate getStartDate() {
//		return startDate;
//	}
//
//	public void setStartDate(LocalDate startDate) {
//		this.startDate = startDate;
//	}
//
//	public LocalDate getEndtDate() {
//		return endtDate;
//	}
//
//	public void setEndtDate(LocalDate endtDate) {
//		this.endtDate = endtDate;
//	}
//
//	public LocalDate getDate() {
//		return date;
//	}
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public Integer getCategoryID() {
//		return categoryID;
//	}
//
//	public void setCategoryID(Integer categoryID) {
//		this.categoryID = categoryID;
//	}
//
//	public LocalDate getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(LocalDate creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	public LocalDate getUpdationDdate() {
//		return updationDdate;
//	}
//
//	public void setUpdationDdate(LocalDate updationDdate) {
//		this.updationDdate = updationDdate;
//	}
//
//	
}
