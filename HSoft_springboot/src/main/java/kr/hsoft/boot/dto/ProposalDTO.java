package kr.hsoft.boot.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class ProposalDTO {
	private int seq;
	private String title;
	private int user;
	private int minAge;
	private int maxAge;
	private String targetGender;
	private int category;
	private String address1;
	private String address2;
	private Date date;
	private int fee;
	private int minParticipants;
	private int maxParticipants;
	private String requirements;
	private String contents; /* html type in here */
	private Timestamp create;
	private Timestamp modify;
	private int status;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTargetGender() {
		return targetGender;
	}
	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMinParticipants() {
		return minParticipants;
	}
	public void setMinParticipants(int minParticipants) {
		this.minParticipants = minParticipants;
	}
	public int getMaxParticipants() {
		return maxParticipants;
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public Timestamp getCreate() {
		return create;
	}
	public void setCreate(Timestamp create) {
		this.create = create;
	}
	public Timestamp getModify() {
		return modify;
	}
	public void setModify(Timestamp modify) {
		this.modify = modify;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
