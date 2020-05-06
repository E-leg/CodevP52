package com.krypton.core.internal.queries;

import java.util.HashMap;

public class RefreshQuery extends Query {

	public RefreshQuery() {
		super();
		this.getQuery();
	}

	public RefreshQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		this.query = "mutation { refreshToken { token expiryDate } }";
	}

}
