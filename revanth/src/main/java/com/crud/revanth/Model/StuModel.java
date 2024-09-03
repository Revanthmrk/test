package com.crud.revanth.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StuModel {
	@Id
	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StuModel [sid=" + sid + "]";
	}

}
