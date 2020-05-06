package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UserManyQuery extends QueryWithRequestedFields {
	public UserManyQuery(HashMap<String, Object> variables, String[] requestedFields) {
		super(variables, requestedFields);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query userMany($filter: FilterFindManyUserPublicInfoInput!, $limit: Int) {");
		sb.append("userMany(filter: $filter, limit: $limit){");
		sb.append("...requestedFields");
		sb.append("}}");
		this.query = sb.toString();

	}

}
