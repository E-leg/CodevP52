package com.krypton.core.internal.queries;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

public abstract class Query {
	protected String query;
	protected HashMap<String, Object> variables;

	public Query() {
		this.variables = null;
	}

	public Query(HashMap<String, Object> variables) {
		this.variables = variables;
	}

	abstract protected void getQuery();

	public String toJson() {
		Gson gsonBuilder = new GsonBuilder().create();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("query", this.query);
		if (variables != null) {
			map.put("variables", this.variables);
		}
		return gsonBuilder.toJson(map);
	}
}
