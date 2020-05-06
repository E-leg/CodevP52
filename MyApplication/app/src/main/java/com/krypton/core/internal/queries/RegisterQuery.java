package com.krypton.core.internal.queries;

import java.util.HashMap;

public class RegisterQuery extends Query {

	public RegisterQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("mutation register($fields: UserRegisterInput!) {").append("register(fields: $fields)").append("}");
		this.query = sb.toString();
	}
}
