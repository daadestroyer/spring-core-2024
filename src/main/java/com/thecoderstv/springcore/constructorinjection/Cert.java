package com.thecoderstv.springcore.constructorinjection;

public class Cert {
	private int certId;
	private String certName;
	public Cert(int certId, String certName) {
		super();
		this.certId = certId;
		this.certName = certName;
	}
	@Override
	public String toString() {
		return "Cert [certId=" + certId + ", certName=" + certName + "]";
	}
	
	
	
}
