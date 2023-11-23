package org.gfg.jbdl53.l7_springboot_curd_on_employee.model;

import java.util.Arrays;



public class CreateMultipleEmployeeRequest {
	CreateEmployeeRequest[] empArray;

	public CreateEmployeeRequest[] getEmpArray() {
		return empArray;
	}

	public void setEmpArray(CreateEmployeeRequest[] empArray) {
		this.empArray = empArray;
	}

	@Override
	public String toString() {
		return "CreateMultipleEmployeeRequest [empArray=" + Arrays.toString(empArray) + "]";
	}

	public CreateMultipleEmployeeRequest(CreateEmployeeRequest[] empArray) {
		super();
		this.empArray = empArray;
	}

	public CreateMultipleEmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
