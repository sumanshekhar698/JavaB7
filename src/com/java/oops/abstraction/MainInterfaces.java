package com.java.oops.abstraction;

public class MainInterfaces {

	public static void main(String[] args) {

//		new CyberSecurityFirm();

		String name = CyberSecurityFirm.NAME;

		CyberGhost cyberGhost = new CyberGhost();
		cyberGhost.servicesProvided();

		CyberSecurityFirm bullSecurity = new CyberSecurityFirm() {//using annnymous inner type

			@Override
			public void servicesProvided() {
				System.out.println(" 1. Server Monitoring \n 2. Firewall Support");

			}

			@Override
			public int numberOfThreatsDetected() {
				return 3222230;
			}
		};
		
		bullSecurity.liveThreatDetectionStatus();

	}

}
