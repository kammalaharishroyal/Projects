package org.gfg.jbdl53.l7_springboot_curd_on_employee.model;

public class DeleteEmployeeResponse {
	
	
	public int id;
	public String message;
	public int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "DeleteEmployeeResponse [id=" + id + ", message=" + message + ", status=" + status + "]";
	}
	public DeleteEmployeeResponse(int id, String message, int status) {
		super();
		this.id = id;
		this.message = message;
		this.status = status;
	}
	public DeleteEmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
