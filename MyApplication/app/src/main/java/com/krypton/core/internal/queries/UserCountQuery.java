package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UserCountQuery extends Query {

	public UserCountQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();

	}

	public UserCountQuery() {
		this.query = "query { userCount }";
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query userCount($filter: FilterUserPublicInfoInput!) {");
		sb.append("userCount(filter: $filter)");
		sb.append("}");
		this.query = sb.toString();

	}
}
