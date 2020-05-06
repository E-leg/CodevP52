package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class UpdateData implements AuthData, QueryData {
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

	@Override
	public String getToken() {
		return (String) data.get("updateMe").get("token");
	}

	@Override
	public String getExpiryDate() {
		return (String) data.get("updateMe").get("expiryDate");
	}

}
