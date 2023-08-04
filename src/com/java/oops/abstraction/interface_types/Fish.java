package com.java.oops.abstraction.interface_types;

public interface Fish {

	boolean isLivesUnderWater = true;

	void fishesSwimming();

}

interface Birds {

	boolean isLivesUnderWater = false;

	void flying();

}

interface Animal extends Fish, Birds {// An interface can extend multiple interfaces

	boolean isBreathingUnderWater = true;

	int lifeSpanOfAFish();
}

class Whale implements Animal {

	@Override
	public void fishesSwimming() {
		// TODO Auto-generated method stub

	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub

	}

	@Override
	public int lifeSpanOfAFish() {
		// TODO Auto-generated method stub
		return 0;
	}

}
