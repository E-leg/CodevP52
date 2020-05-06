package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class UserCountData implements QueryData {
	public Map<String, Integer> data;
	public List<Map<String, String>> errors;

	@Override
	public Map<String, Integer> getData() {
		return this.data;
	}

	@Override
	public List<Map<String, String>> getErrors() {
		return this.errors;
	}
}
