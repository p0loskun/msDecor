package com.github.minersstudios.msdecor.customdecor;

@SuppressWarnings("unused")
public interface Lightable extends CustomDecorData {
	default int getFirstLightLevel() {
		return 0;
	}

	default void setFirstLightLevel(int level) {}

	default int getSecondLightLevel() {
		return 0;
	}

	default void setSecondLightLevel(int level) {}
}
