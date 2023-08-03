package com.java.oops.abstraction;

public class CyberGhost implements CyberSecurityFirm {

	@Override
	public int numberOfThreatsDetected() {
		return 324230;
	}

	@Override
	public void servicesProvided() {
		System.out.println(" 1. Server Monitoring \n 2. Firewall Support \n 3. Anti Ransomware Support");

	}

}
