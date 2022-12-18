package com.github.minersstudios.msdecor.customdecor;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface Wrenchable extends Typed {

	@Contract("null -> null")
	default @Nullable Type getNextType(@Nullable Type type) {
		if (type == null) return null;
		List<Type> types = List.of(this.getTypes());
		int index = types.indexOf(type) + 1;
		return types.get(index > types.size() ? 0 : index);
	}
}
