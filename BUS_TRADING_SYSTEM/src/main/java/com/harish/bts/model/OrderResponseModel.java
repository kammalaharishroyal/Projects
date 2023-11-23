package com.harish.bts.model;

public class OrderResponseModel {
	private int OrderId;
	private String CustomerName;
	private int driverId;
	private String DriverName;
	private int BusNumber;
	private int pincode;
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	public int getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(int busNumber) {
		BusNumber = busNumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "OrderResponseModel [OrderId=" + OrderId + ", CustomerName=" + CustomerName + ", driverId=" + driverId
				+ ", DriverName=" + DriverName + ", BusNumber=" + BusNumber + ", pincode=" + pincode + "]";
	}
	public OrderResponseModel(int orderId, String customerName, int driverId, String driverName, int busNumber,
			int pincode) {
		super();
		OrderId = orderId;
		CustomerName = customerName;
		this.driverId = driverId;
		DriverName = driverName;
		BusNumber = busNumber;
		this.pincode = pincode;
	}
	public OrderResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
