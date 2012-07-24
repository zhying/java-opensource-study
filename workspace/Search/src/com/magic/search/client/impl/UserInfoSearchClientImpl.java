package com.magic.search.client.impl;

import com.magic.search.bean.param.UserInfoParamBean;
import com.magic.search.bean.result.UserInfoResultBean;
import com.magic.search.client.UserInfoSearchClient;

public class UserInfoSearchClientImpl extends SearchClientImpl<UserInfoParamBean, UserInfoResultBean> implements
		UserInfoSearchClient<UserInfoParamBean,UserInfoResultBean> {

	public UserInfoSearchClientImpl(String serviceUrl) {
		super(serviceUrl);
	}

}