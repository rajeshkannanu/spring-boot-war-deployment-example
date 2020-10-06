package com.sample.workspace.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "api_stats")
public class APIStats {
	
	
	public APIStats(String message, String caller, String  createdTimestamp2, String createdTimestamp3,
			String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		this.apiCaller = message;
		this.apiName = caller;
		this.createdTimestamp = createdTimestamp2;
		this.createdTimestamp = createdTimestamp3;
		this.createdBy = string;
		this.updateBy = string2;
		this.status = string3;
		this.failureReason = string4;
	}
	
	private String apiCaller;
	/**
	 * @return the apiCaller
	 */
	public String getApiCaller() {
		return apiCaller;
	}
	/**
	 * @param apiCaller the apiCaller to set
	 */
	public void setApiCaller(String apiCaller) {
		this.apiCaller = apiCaller;
	}
	/**
	 * @return the apiName
	 */
	public String getApiName() {
		return apiName;
	}
	/**
	 * @param apiName the apiName to set
	 */
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	/**
	 * @return the createdTimestamp
	 */
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}
	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	/**
	 * @return the updatedTimestamp
	 */
	public String getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(String updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the failureReason
	 */
	public String getFailureReason() {
		return failureReason;
	}
	/**
	 * @param failureReason the failureReason to set
	 */
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}
	private String apiName;
	private String createdTimestamp;
	private String updatedTimestamp ;
	private String createdBy;
	private String updateBy;
	private String status;
	private String failureReason;

}
