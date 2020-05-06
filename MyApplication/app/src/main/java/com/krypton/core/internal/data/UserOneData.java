package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class UserOneData implements QueryData {
	public Map<String, Map<String, Object>> data;
	public List<Map<String, String>> errors;

	@Override
	public Map<String, Map<String, Object>> getData() {
		return this.data;
	}

	@Override
	public List<Map<String, String>> getErrors() {
		return this.errors;
	}
}
