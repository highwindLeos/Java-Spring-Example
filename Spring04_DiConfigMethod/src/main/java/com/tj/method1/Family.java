package com.tj.method1;

public class Family {
	private String papaName;
	private String mamiName;
	private String sisterName;
	private String brotherName;
	
	public Family(String papaname, String mamiName) {
		this.papaName = papaname;
		this.mamiName = mamiName;
	}

	@Override
	public String toString() {
		return "가족정보 [papaName=" + papaName + ", mamiName=" + mamiName + ", sisterName=" + sisterName
				+ ", brotherName=" + brotherName + "]";
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}

	public String getPapaName() {
		return papaName;
	}

	public String getMamiName() {
		return mamiName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public String getBrotherName() {
		return brotherName;
	}
	
	
}
