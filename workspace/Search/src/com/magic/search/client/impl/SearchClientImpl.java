package com.magic.search.client.impl;



import com.magic.search.client.SearchClient;

public abstract class SearchClientImpl<P,R> implements SearchClient<P, R>{

	protected String serviceUrl = null;
	
	public SearchClientImpl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
