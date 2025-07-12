package com.rags.plans.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "plan_category")
@Data
public class PlansCategory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer categoryId;

	@Column(name = "category_name")
	private String categoryName;

	private LocalDate date;
	
	private String status;

	private String creator;

	@Column(name = "updated_value")
	private String updatedValue;

	@Column(name = "creation_date", updatable = false)
	@CreationTimestamp
	private LocalDate creationDate;
	
	@Column(name = "update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updationDdate;

//	public Integer getCategoryId() {
//		return categoryId;
//	}
//
//	public void setCategoryId(Integer categoryId) {
//		this.categoryId = categoryId;
//	}
//
//	public String getCategoryName() {
//		return categoryName;
//	}
//
//	public void setCategoryName(String categoryName) {
//		this.categoryName = categoryName;
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
//	public String getCreator() {
//		return creator;
//	}
//
//	public void setCreator(String creator) {
//		this.creator = creator;
//	}
//
//	public String getUpdatedValue() {
//		return updatedValue;
//	}
//
//	public void setUpdatedValue(String updatedValue) {
//		this.updatedValue = updatedValue;
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

	
}
