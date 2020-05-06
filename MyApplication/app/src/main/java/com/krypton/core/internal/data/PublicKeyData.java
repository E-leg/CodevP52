package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public class PublicKeyData implements QueryData {
	public Map<String, String> data;
	public List<Map<String, String>> errors;

	public Map<String, String> getData() {
		return this.data;
	}

	public List<Map<String, String>> getErrors() {
		return this.errors;
	}

}
