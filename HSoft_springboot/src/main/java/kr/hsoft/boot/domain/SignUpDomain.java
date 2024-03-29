package kr.hsoft.boot.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.lang.Nullable;

@JsonComponent
public class SignUpDomain {
	@NotEmpty
	private String userID;
	@NotEmpty
	private String password;
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String phone;
	@Nullable
	private String address1;
	@Nullable
	private String address2;
	
	@Nullable
	private String gender;
	@NotEmpty
	private String nickname;
	@Nullable
	private String location;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
