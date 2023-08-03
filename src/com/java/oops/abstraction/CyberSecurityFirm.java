package com.java.oops.abstraction;

public interface CyberSecurityFirm {// R1: this cannot be directly instatntiated

	String NAME = "CyberGhost";// R2: All the variables are final and public and static impplicitly
	public static final String SECRET_CODE = "3e23n435$#";

//	int numberOfThreatsDetected() {
//		return 445522;
//	}

	abstract int numberOfThreatsDetected();// methods inside interfaces are implicitly abstract so abstract keyword is
											// optional

	void servicesProvided();

	// JDK 8
	default void liveThreatDetectionStatus() {// you can have default concrete methods inside an interface
		System.out.println("STATUS : " + "enabled");
	}

	static void firewallStatus() {// you can have static concrete methods inside an interface
		System.out.println("STATUS : " + "disabled");
	}

}
