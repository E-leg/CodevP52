package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class UserManyData implements QueryData {
	public Map<String, Map[]> data;
	public List<Map<String, String>> errors;

	@Override
	public Map<String, Map[]> getData() {
		return this.data;
	}

	@Override
	public List<Map<String, String>> getErrors() {
		return this.errors;
	}
}
