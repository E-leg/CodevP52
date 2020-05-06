package com.krypton.core.internal.queries;

import java.util.HashMap;

public class UserPaginationQuery extends QueryWithRequestedFields {
	public UserPaginationQuery(HashMap<String, Object> variables, String[] requestedFields) {
		super(variables, requestedFields);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query userPagination($filter: FilterFindManyUserPublicInfoInput!, $page: Int!, $perPage: Int!) {");
		sb.append("userPagination(filter: $filter, page: $page, perPage: $perPage){");
		sb.append("...requestedFields");
		sb.append("}}");
		this.query = sb.toString();

	}

	public String getRequestedFieldsFragment() {
		String requestedFieldsstr = String.join(" ", this.requestedFields);
		StringBuilder sb = new StringBuilder();
		sb.append("fragment requestedFields on UserPublicInfoPagination {");
		sb.append("items{");
		sb.append(requestedFieldsstr + "}");
		sb.append("pageInfo{");
		sb.append("currentPage\n");
		sb.append("perPage\n");
		sb.append("pageCount\n");
		sb.append("itemCount\n");
		sb.append("hasNextPage\n");
		sb.append("hasPreviousPage");
		sb.append("}}");
		return sb.toString();

	}
}
