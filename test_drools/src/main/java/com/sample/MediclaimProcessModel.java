package com.sample;

public class MediclaimProcessModel {

	public String userName;
	public Integer userAge;
	public String gender;
	
	public boolean userCoverage = false;
	public boolean result = false;	
	
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	
	public String getUserSex() {
		return gender;
	}
	public void setUserSex(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean getUserCoverage() {
		return userCoverage;
	}
	public void setUserCoverage(boolean userCoverage) {
		this.userCoverage = userCoverage;
	}
	public boolean getResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
}
