package com.greedy.ncs.member.model.dto;

import java.util.HashSet;
import java.util.Set;

public class MemberDTO {


	double 회원번호;
	String id;
	String pwd;
	String name;
	double date;
	double height;
	int weight;
	Boolean 활성화유무;
	
    public MemberDTO(){};
	
    MemberDTO(double 회원번호,String id,String pwd,String name,double date,double height,int weight,Boolean 활성화유무){};
    
    public double getNumber() {
    	return 회원번호;
    }
    public void setNumber(double 회원번호) {
    	this.회원번호=회원번호;
    }
    public String getId() {
    	return id;
    }
   public void setId(String id) {
	   this.id= id;
   }
	public String getPwd() {
		return pwd;
	}
   public void setPwd(String pwd) {
	   this.pwd = pwd;
   }
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}


	public double getdate() {
		return date;
	}

	public void setdate(double date) {
		this.date = date;
	}

	public double getheight () {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public int getweight() {
		return weight;
	}

	public void setweight(int weight) {
		this.weight = weight;
	}

	public Boolean getisActivated() {
		return 활성화유무;
	}

	public void setisActivated(Boolean 활성화유무) {
		this.활성화유무 = 활성화유무;
	}
}

