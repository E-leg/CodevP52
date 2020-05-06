package com.krypton.core.internal.queries;

import java.util.HashMap;

public class DeleteQuery extends Query {

	public DeleteQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("mutation deleteMe($password: String!) {").append("deleteMe(password: $password)").append("}");
		this.query = sb.toString();
	}
}
