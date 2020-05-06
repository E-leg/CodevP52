package com.krypton.core.internal.queries;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class QueryWithRequestedFields extends Query {
	protected String[] requestedFields;

	public QueryWithRequestedFields(HashMap<String, Object> variables, String[] requestedFields) {
		super(variables);
		this.requestedFields = requestedFields;
	}

	public String getRequestedFieldsFragment() {
		String requestedFieldsstr = String.join(" ", this.requestedFields);
		return "fragment requestedFields on UserPublicInfo {" + requestedFieldsstr + "}";
	}

	public String toJson() {
		Gson gsonBuilder = new GsonBuilder().create();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("query", this.query + " " + this.getRequestedFieldsFragment());
		if (variables != null) {
			map.put("variables", this.variables);
		}
		return gsonBuilder.toJson(map);
	}
}
