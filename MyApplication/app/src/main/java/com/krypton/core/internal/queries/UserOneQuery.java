package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UserOneQuery extends QueryWithRequestedFields {
	public UserOneQuery(HashMap<String, Object> variables, String[] requestedFields) {
		super(variables, requestedFields);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query userOne($filter: FilterFindOneUserPublicInfoInput!) {");
		sb.append("userOne(filter: $filter){");
		sb.append("...requestedFields");
		sb.append("}}");
		this.query = sb.toString();

	}

}
