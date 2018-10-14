package com.yahui.wxtms.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yahui.wxtms.domain.manage.TmsUser;
import com.yahui.wxtms.repository.TmsUserRepository;
import com.yahui.wxtms.util.SignUtil;

@Component
public class TmsUserServiceImpl implements TmsUserService {
	
	@Autowired
	private TmsUserRepository tmsUserReposity;

	@Override
	public TmsUser verifyUser(TmsUser user) {
		if(!Strings.isBlank(user.getUserName()) && !Strings.isBlank(user.getPassword())) {
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("SHA-1");
				String password = SignUtil.byteToStr(md.digest(user.getPassword().getBytes()));
				return tmsUserReposity.findByUserNameAndPassword(user.getUserName(), password);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

}
