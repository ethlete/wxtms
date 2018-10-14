package com.yahui.wxtms.repository;

import org.springframework.data.repository.CrudRepository;

import com.yahui.wxtms.domain.manage.TmsUser;

public interface TmsUserRepository extends CrudRepository<TmsUser, String>{
	
	TmsUser findByUserNameAndPassword(String userName, String password);

}
