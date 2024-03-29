package kr.hsoft.boot.domain;

public class ApplicationDomain {
	private int seq;
	private UserDomain user;
	private ProposalReadDomain proposal;
	private String contents;
	private int childrenCount;
	private int enable;

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public UserDomain getUser() {
		return user;
	}
	public void setUser(UserDomain user) {
		this.user = user;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getChildrenCount() {
		return childrenCount;
	}
	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public ProposalReadDomain getProposal() {
		return proposal;
	}
	public void setProposal(ProposalReadDomain proposal) {
		this.proposal = proposal;
	}
	
	
}