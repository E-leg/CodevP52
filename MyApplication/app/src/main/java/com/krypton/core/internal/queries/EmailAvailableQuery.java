package com.krypton.core.internal.queries;

import java.util.HashMap;

public class EmailAvailableQuery extends Query {
	public EmailAvailableQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query emailAvailable($email: String!) {").append("emailAvailable(email: $email)").append("}");
		this.query = sb.toString();
	}
}
