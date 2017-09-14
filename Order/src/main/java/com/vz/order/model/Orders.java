package com.vz.order.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@Table(name="orders")
public class Orders {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="address_one")
	private String addressOne;

	@Column(name="address_two")
	private String addressTwo;

	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="order_type")
	private String orderType;

	@Column(name="order_version")
	private String orderVersion;

	@Column(name="pro_version")
	private String proVersion;

	private String region;

	@Column(name="req_source")
	private String reqSource;

	public Orders() {
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getAddressOne() {
		return this.addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return this.addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderVersion() {
		return this.orderVersion;
	}

	public void setOrderVersion(String orderVersion) {
		this.orderVersion = orderVersion;
	}

	public String getProVersion() {
		return this.proVersion;
	}

	public void setProVersion(String proVersion) {
		this.proVersion = proVersion;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReqSource() {
		return this.reqSource;
	}

	public void setReqSource(String reqSource) {
		this.reqSource = reqSource;
	}
}