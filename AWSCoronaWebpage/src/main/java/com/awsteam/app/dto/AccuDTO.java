package com.awsteam.app.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 자동으로 모든 먀갸변수를 받는 생성자를 생성
@Getter // Getter 생성
@Setter // Setter 생성
public class AccuDTO {
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getDeath() {
		return death;
	}
	public void setDeath(int death) {
		this.death = death;
	}
	public int getReleased() {
		return released;
	}
	public void setReleased(int released) {
		this.released = released;
	}
	public int getTested() {
		return tested;
	}
	public void setTested(int tested) {
		this.tested = tested;
	}
	public int getNegative() {
		return negative;
	}
	public void setNegative(int negative) {
		this.negative = negative;
	}
	private int confirmed;
	private int death;
	private int released;
	private int tested;
	private int negative;
}
