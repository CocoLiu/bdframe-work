package org.bdframe.work.service;

import javax.annotation.Resource;

import org.bdframe.core.api.AccountInfoApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountInfoController {
	private static Logger logger = LoggerFactory.getLogger(AccountInfoController.class);
	
	@Resource
	private AccountInfoApi accountInfoApi;
	
	@RequestMapping(path = "/listUsers", method = RequestMethod.GET)
	public Object ListAccountInfo(String tablename,String family)
	{
		return accountInfoApi.listAccountInfo(tablename, family);
	}
}
