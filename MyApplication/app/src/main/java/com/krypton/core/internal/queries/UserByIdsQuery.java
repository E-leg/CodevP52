package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UserByIdsQuery extends QueryWithRequestedFields {

	public UserByIdsQuery(HashMap<String, Object> variables, String[] requestedFields) {
		super(variables, requestedFields);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query userByIds($ids: [MongoID]!) {) {");
		sb.append("userByIds(_ids: $ids){");
		sb.append("...requestedFields");
		sb.append("}}");
		this.query = sb.toString();

	}
}
