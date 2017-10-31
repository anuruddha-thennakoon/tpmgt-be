package org.tpmgt.data;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class CallManagerEmployee {

	public static final String SEARCH_API_BASE = "http://192.168.100.165:8280/search_api/employees";
	public static WebTarget rootTarget = null;

	public static WebTarget getRootTarget() {

		if (rootTarget == null) {

			try {
				final Client client = ClientBuilder.newBuilder().build();
				rootTarget = client.target(SEARCH_API_BASE);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rootTarget;
	}
}
