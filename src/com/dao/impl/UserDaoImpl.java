package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import com.framework.impl.DaoImpl;
import org.springframework.stereotype.Repository;

/**
 * @author : Iman
 * date : 2019/4/22
 */

@Repository
public class UserDaoImpl extends DaoImpl<User> implements UserDao<User> {

}
