package com.krypton.core.internal.queries;

import java.util.HashMap;

public class SendPasswordRecoveryQuery extends Query {

	public SendPasswordRecoveryQuery(HashMap<String, Object> variables) {
		super(variables);
		this.getQuery();
	}

	public void getQuery() {
		StringBuilder sb = new StringBuilder();
		sb.append("query sendPasswordRecoveryEmail($email: String!) {")
				.append("sendPasswordRecoveryEmail(email: $email)").append("}");
		this.query = sb.toString();
	}

}
