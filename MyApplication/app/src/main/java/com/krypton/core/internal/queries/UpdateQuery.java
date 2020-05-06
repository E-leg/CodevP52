package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UpdateQuery extends Query {
	public UpdateQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("mutation updateMe($fields: UserUpdateInput!) {").append("updateMe(fields: $fields) {")
				.append("token expiryDate").append("}}");
		this.query = sb.toString();
	}

}
