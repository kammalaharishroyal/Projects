package com.harish.bts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Bus {
		
		@Id
		private int id;
		@NotBlank
		private int number;
		@NotNull
		private boolean status=true;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = true;
		}
		public Bus(int number) {
			super();
			this.number = number;
		}
		public Bus() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Bus [id=" + id + ", number=" + number + ", status=" + status + "]";
		}
		
		
}
