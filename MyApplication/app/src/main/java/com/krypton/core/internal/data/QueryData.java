package com.krypton.core.internal.data;

import java.util.List;
import java.util.Map;

public interface QueryData {

	public Map<String, ?> getData();

	public List<Map<String, String>> getErrors();
}
