package com.harish.bts.model;

import com.harish.bts.entity.Adress;

public class TakeOrder {
	private int cid;
	private int bid;
	private Adress a;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Adress getA() {
		return a;
	}
	public void setA(Adress a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "TakeOrder [cid=" + cid + ", bid=" + bid + ", a=" + a + "]";
	}
	public TakeOrder(int cid, int bid, Adress a) {
		super();
		this.cid = cid;
		this.bid = bid;
		this.a = a;
	}
	public TakeOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
