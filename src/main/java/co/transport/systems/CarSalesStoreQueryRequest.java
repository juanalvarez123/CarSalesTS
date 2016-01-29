package co.transport.systems;

import java.util.Date;

public class CarSalesStoreQueryRequest {

	private int query;

	private Date actualTimestamp;

	public int getQuery() {

		return query;
	}

	public void setQuery(int query) {

		this.query = query;
	}

	public Date getTimestamp() {

		return actualTimestamp;
	}

	public void setTimestamp(Date timestamp) {

		this.actualTimestamp = timestamp;
	}

}
