package com.ittx.car.model;

import java.util.Date;

public class Vehicle {
	private int id;
	private String vehicleNumber;//车牌号
	private String productFactor;//生产厂家
	private String vehicleType; //车辆类型
	private String vehicleColor;//车辆颜色
	private String vehicleImg; //图片
	private String engineNumber; //机动车号
	private String vehicleHost; //车主
	private String telephone; //联系电话
	private String hostType;//车主类型
	private String remark;//备注
	private Date createTime; //创建时间
	
	public Vehicle() {
	}
	public Vehicle(int id, String vehicleNumber, String productFactor, String vehicleType, String vehicleColor,
			String vehicleImg, String engineNumber, String vehicleHost, String telephone, String hostType, String remark,Date createTime) {
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.productFactor = productFactor;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.vehicleImg = vehicleImg;
		this.engineNumber = engineNumber;
		this.vehicleHost = vehicleHost;
		this.telephone = telephone;
		this.hostType = hostType;
		this.remark = remark;
	}
	public Vehicle(String vehicleNumber, String productFactor, String vehicleType, String vehicleColor,
			String vehicleImg, String engineNumber, String vehicleHost, String telephone, String hostType, String remark,Date createTime) {
		this.vehicleNumber = vehicleNumber;
		this.productFactor = productFactor;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.vehicleImg = vehicleImg;
		this.engineNumber = engineNumber;
		this.vehicleHost = vehicleHost;
		this.telephone = telephone;
		this.hostType = hostType;
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getProductFactor() {
		return productFactor;
	}
	public void setProductFactor(String productFactor) {
		this.productFactor = productFactor;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getVehicleImg() {
		return vehicleImg;
	}
	public void setVehicleImg(String vehicleImg) {
		this.vehicleImg = vehicleImg;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getVehicleHost() {
		return vehicleHost;
	}
	public void setVehicleHost(String vehicleHost) {
		this.vehicleHost = vehicleHost;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getHostType() {
		return hostType;
	}
	public void setHostType(String hostType) {
		this.hostType = hostType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleNumber=" + vehicleNumber + ", productFactor=" + productFactor
				+ ", vehicleType=" + vehicleType + ", vehicleColor=" + vehicleColor + ", vehicleImg=" + vehicleImg
				+ ", engineNumber=" + engineNumber + ", vehicleHost=" + vehicleHost + ", telephone=" + telephone
				+ ", hostType=" + hostType + ", remark=" + remark + ", createTime=" + createTime + "]";
	}

	

}
