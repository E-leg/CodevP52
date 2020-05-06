package com.krypton.core.internal.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class GenericData implements QueryData {
	public Map<String, ?> data;
	public List<Map<String, String>> errors;

	public Map<String, ?> getData() {
		return data;
	}

	public List<Map<String, String>> getErrors() {
		return errors;
	}

}
