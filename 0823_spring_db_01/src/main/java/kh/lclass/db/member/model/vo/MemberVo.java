package kh.lclass.db.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class MemberVo {
//	CUSTNO	NUMBER(6,0)	No	
//	CUSTNAME	VARCHAR2(20 BYTE)	Yes	
//	PHONE	VARCHAR2(13 BYTE)	Yes	
//	ADDRESS	VARCHAR2(60 BYTE)	Yes	
//	JOINDATE	DATE	Yes	
//	GRADE	CHAR(1 BYTE)	Yes	
//	CITY	CHAR(2 BYTE)	Yes	
	private String mid;
	private String mpwd;
	private String mname;
	private String memail;
	@Override
	public String toString() {
		return "MemberVo [mid=" + mid + ", mpwd=" + mpwd + ", mname=" + mname + ", memail=" + memail + "]";
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
	
}
