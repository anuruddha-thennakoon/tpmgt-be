package org.tpmgt.data;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class CallManagerMD {

	public static final String MASTER_DATA_API_BASE = "http://192.168.100.165:8280/search_api/md";
	public static WebTarget rootTarget = null;

	public static WebTarget getRootTarget() {

		if (rootTarget == null) {

			try {
				final Client client = ClientBuilder.newBuilder().build();
				rootTarget = client.target(MASTER_DATA_API_BASE);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rootTarget;
	}

}
